package dev.test;

import java.io.Serializable;
import java.util.Objects;
import java.util.StringJoiner;

public class FizzBuzz implements Serializable {
	private static final long serialVersionUID = 1662469271918945072L;

	private Integer clause;
	private String message;

	public FizzBuzz(Integer clause, String message) {
		this.setClause(clause);
		this.setMessage(message);
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", FizzBuzz.class.getSimpleName() + "[", "]")
						.add("clause=" + this.getClause())
						.add("message='" + this.getMessage() + "'")
						.toString();
	}

	public Integer getClause() {
		return clause;
	}

	public void setClause(Integer clause) {
		this.clause = clause;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		FizzBuzz that = (FizzBuzz) o;
		return getClause().equals(that.getClause());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getClause());
	}
}
