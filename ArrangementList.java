import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//import java.io.File;
import static java.nio.file.StandardOpenOption.*;
import java.nio.file.*;
import java.io.*;
public class ArrangementList extends ColumnList{
	protected int myArrangementNumber;
	
	public ArrangementList(ArrayList<ArrayList<ArrayList<String>>> table, int rowNumber, int columnNumber, int arrangementNumber){
		super(table, rowNumber, columnNumber);
		myArrangementNumber = arrangementNumber;
	}
	public void setArrangementNumber(int arrangementNumber){
		myArrangementNumber = arrangementNumber;
	}
	public int getArrangmentNumber(){
		return myArrangementNumber;
	}
	public String getArrangementValue(){
		return myTable.get(myRowNumber).get(myColumnNumber).get(myArrangementNumber);
	}
	public void addValues(String input){
		myTable.get(myRowNumber).get(myColumnNumber).add(myArrangementNumber, input);
		//this.myTable = table;
	}
	public void editValues(int arrangementOrder, String input){
		myArrangementNumber = arrangementOrder;
	 myTable.get(myRowNumber).get(myColumnNumber).set(myArrangementNumber, input);
		//this.myTable = table;
	}
	public void editValues(String input){
		myTable.get(myRowNumber).get(myColumnNumber).set(myArrangementNumber, input);
		//this.myTable = table;
	}
}