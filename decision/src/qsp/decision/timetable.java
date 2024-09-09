package qsp.decision;

public class timetable {
public static void main(String[]args) {
	String days="wednesday";
	switch(days) {
	case "monday":{
		System.out.println("ML");
		break;
	}
	case "tuesday":{
		System.out.println("MAD");
		break;
	}
	case "wednesday":{
		System.out.println("CN");
		break;
	}
	default:{
		System.out.println("CC");
		break;
	}
	}
}
}
