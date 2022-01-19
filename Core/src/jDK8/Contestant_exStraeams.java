package jDK8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Contestant_exStraeams {

	public String phone = null;
	public String name = null;
	public Contestant_exStraeams() {
	
	}
	public Contestant_exStraeams(String n, String p) {
		name = n;
		phone = p;
	}
public static void main(String[] args) {
	ArrayList<Contestant_exStraeams> list = new ArrayList<Contestant_exStraeams>();
	list.add(new Contestant_exStraeams("Ram","9893989495"));
	list.add(new Contestant_exStraeams("shyam","7689787656"));
	list.add(new Contestant_exStraeams("aman","989767456"));
	list.add(new Contestant_exStraeams("naman","7733445566"));
	list.add(new Contestant_exStraeams("kappu","6298453678"));
	list.add(new Contestant_exStraeams("virendra","23366"));
	list.add(new Contestant_exStraeams("luckey","7675898767"));
	list.add(new Contestant_exStraeams("kumar","11"));
	list.add(new Contestant_exStraeams("singh","8889345645"));
	list.add(new Contestant_exStraeams("ranbir","9893989495"));

	
	//list.stream().map(e-> e.phone).forEach(e-> System.out.println(e));//Get the phone numbers
	//list.stream().map(e-> e.phone).filter(e->e.length()==10).forEach(e-> System.out.println(e));//Get valid phone numbers
	//list.stream().map(e-> e.phone).filter(e->e.length()==10).distinct().forEach(e-> System.out.println(e));//Remove duplicate phone numbers
	//list.stream().map(e-> e.phone).filter(e->e.length()==10).distinct().collect(Collectors.collectingAndThen(Collectors.toList(),e->{Collections.shuffle(e);return e.stream();})).forEach(e-> System.out.println(e));//Shuffle Phone numbers
	//list.stream().map(e-> e.phone).filter(e->e.length()==10).distinct().collect(Collectors.collectingAndThen(Collectors.toList(),e->{Collections.shuffle(e);return e.stream();})).limit(3).forEach(e-> System.out.println(e));//Get 3 Winners
	

	//list.stream().map(e-> e.phone).filter(e->e.length()==10).distinct().collect(Collectors.collectingAndThen(Collectors.toList(),e->{Collections.shuffle(e);return e.stream();})).limit(3).forEach(e-> System.out.println(e));//Finally Display winners
}
}
