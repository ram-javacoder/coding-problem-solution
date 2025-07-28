package trainingPart2Qs;

import java.util.Objects;

public class SubjectMark {

	private String subject;
	private double mark;

	public SubjectMark() {

		super();
	}

	public SubjectMark(String subject, double mark) {
		super();
		this.subject = subject;
		this.mark = mark;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}

	@Override
	public int hashCode() {
		return Objects.hash(mark, subject);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SubjectMark other = (SubjectMark) obj;
		return Double.doubleToLongBits(mark) == Double.doubleToLongBits(other.mark)
				&& Objects.equals(subject, other.subject);
	}

	@Override
	public String toString() {
		return "SubjectMark [subject=" + subject + ", mark=" + mark + "]";
	}

}
