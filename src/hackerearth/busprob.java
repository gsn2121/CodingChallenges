package hackerearth;

import java.util.ArrayList;
import java.util.List;
// import java.util.Spliterator;
//class Passanger
//{
//    int id;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public float getFare() {
//        return fare;
//    }
//
//    public void setFare(float fare) {
//        this.fare = fare;
//    }
//    float fare;
//    public Passanger(int id, float fare)
//    {
//        this.id=id;
//        this.fare=fare;
//    }
//}
//public class BusProb {

import dao.DataSet;

public class busprob {
	String outstring;

	public void query1() {

	}

	public void query2() {

	}

	public void query3() {

	}

	public void query4() {

	}

	public String output(int capacity, int stops, List<String> listOfInputStrings, String query) {

		busprob obj = new busprob();
		int on = 0, off = 0;
		String outstring = "";
		List<DataSet> PassengerList = new ArrayList<DataSet>();
		String stop_pass_on[][] = new String[100][3];
		String stop_pass_off[][] = new String[100][3];
		String pass, stop_pass_str;
		// Write your code here
		for (int i = 0; i < stops; i++) {
			stop_pass_str = listOfInputStrings.get(i);
			stop_pass_str.trim();
			// stop_pass_str = stop_pass_str + " " ;
			String[] parts = stop_pass_str.split(" ");
			for (int j = 0; j < parts.length; j++) {
				pass = parts[j].trim();
				if (pass.charAt(0) == '+') {
					DataSet Passenger = new DataSet();
					Passenger.PassID = pass.substring(1);
					PassengerList.add(Passenger);
					stop_pass_on[on++][0] = pass.substring(1);

				} else if (pass.charAt(0) == '-') {
					DataSet Passenger = new DataSet();
					Passenger.PassID = pass.substring(1);
					PassengerList.add(Passenger);
					stop_pass_off[off++][0] = pass.substring(1);
				}
			}
		}
		switch (query)

		{
			case "1": {
				obj.query1();
				break;
			}
			case "2": {
				obj.query2();
				break;
			}
			case "3": {
				obj.query3();
				break;
			}
			case "4": {
				obj.query4();
				break;
			}

		}
		outstring = obj.outstring;
		return outstring;
	}
}
