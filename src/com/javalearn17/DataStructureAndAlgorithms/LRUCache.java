package com.javalearn17.DataStructureAndAlgorithms;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

	class Node {
		int key, value;
		Node prev, next;

		Node(int k, int v) {
			key = k;
			value = v;
		}
	}

	private final int capacity;
	private Map<Integer, Node> cache;
	private Node head, tail; // dummy nodes for easy handling

	public LRUCache(int capacity) {
		this.capacity = capacity;
		cache = new HashMap<>();

		// create dummy head and tail
		head = new Node(0, 0);
		tail = new Node(0, 0);
		head.next = tail;
		tail.prev = head;
	}

	// remove node from list
	private void remove(Node node) {
		node.prev.next = node.next;
		node.next.prev = node.prev;
	}

	// insert node right after head (most recent position)
	private void insert(Node node) {
		node.next = head.next;
		head.next.prev = node;
		head.next = node;
		node.prev = head;
	}

	public int get(int key) {
		if (cache.containsKey(key)) {
			Node node = cache.get(key);
			remove(node); // move node to most recent
			insert(node);
			return node.value;
		}
		return -1; // not found
	}

	public void put(int key, int value) {
		if (cache.containsKey(key)) {
			// update value and move to front
			Node node = cache.get(key);
			node.value = value;
			remove(node);
			insert(node);
		} else {
			if (cache.size() == capacity) {
				// remove least recently used (node before tail)
				Node lru = tail.prev;
				remove(lru);
				cache.remove(lru.key);
			}
			Node newNode = new Node(key, value);
			cache.put(key, newNode);
			insert(newNode);
		}
	}

	// for debugging
	public void printCache() {
		Node cur = head.next;
		while (cur != tail) {
			System.out.print(cur.key + "=" + cur.value + " ");
			cur = cur.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		LRUCache lru = new LRUCache(2);

		lru.put(1, 10); // cache = {1=10}
		lru.put(2, 20); // cache = {1=10, 2=20}
		lru.printCache();

		System.out.println("Get 1: " + lru.get(1)); // returns 10, cache order = {2=20, 1=10}
		lru.printCache();

		lru.put(3, 30); // evicts key 2, cache = {1=10, 3=30}
		lru.printCache();

		System.out.println("Get 2: " + lru.get(2)); // returns -1 (not found)
	}
}
