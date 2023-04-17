package helloworld;


import java.util.*;
public class Question {
	int qid;
	String qname;
	List<String> answers;
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	public void display() {
		System.out.println(qid);
		System.out.println(qname);
		Iterator<String> itr=answers.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}