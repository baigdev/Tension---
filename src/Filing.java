import java.io.*;
import java.util.ArrayList;

public class Filing  {

	ArrayList<String> userlist = new ArrayList<String>();
	ArrayList<String> passlist = new ArrayList<String>();
	Details[] infolist = new Details[10];
	String struser,strpass;
	public void writeUsername() throws IOException
	{
		FileWriter fw = new FileWriter("E:/UserInfo.txt", true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.newLine();
		bw.write(Signup.name);
		bw.close();
	}
	public void generateObj()
	{
		for(int i=0;i<=9;i++)
		{
			infolist[i]= new Details();
		}
	}
	public void writePass() throws IOException
	{
		FileWriter fw = new FileWriter("E:/PassInfo.txt", true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.newLine();
		bw.write(Signup.pass);
		bw.close();
	}
	public void readUsername() throws IOException
	{
		FileReader fr = new FileReader("E:/UserInfo.txt");
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(fr);
		while((struser=br.readLine())!=null)
		{
			userlist.add(struser);
		}
	}
	public void readPass() throws IOException
	{
		FileReader fr = new FileReader("E:/PassInfo.txt");
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(fr);
		while((strpass=br.readLine())!=null)
		{
			passlist.add(strpass);
		}
	}
	public void writeDetails() throws IOException
	{
		FileWriter fw = new FileWriter("E:/Details.txt",true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.newLine();
		bw.write(Signup.name);
		bw.newLine();
		bw.write(Signup.pass);
		bw.newLine();
		bw.write(Signup.gender);
		bw.newLine();
		bw.write(Signup.phone);
		bw.newLine();
		bw.write(Signup.email);
		bw.newLine();
		bw.write(Signup.cnic);
		bw.newLine();
	    bw.close();
	    fw.close();
	}
	public void readDetails() throws IOException
	{
		int i=0;
		String str="";
		FileReader fr = new FileReader("E:/Details.txt");
		BufferedReader br = new BufferedReader(fr);
		generateObj();
		while((str = br.readLine())!=null)
		{
			infolist[i].setName(br.readLine());
			infolist[i].setPass(br.readLine());
			infolist[i].setGender(br.readLine());
			infolist[i].setPhone(br.readLine());
			infolist[i].setEmail(br.readLine());
			infolist[i].setCnic(br.readLine());
			i++;
		}
		br.close();
	}
}

