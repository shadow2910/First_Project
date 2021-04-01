class Email{
// Implement Email Class according to the specifiaction.
Header header;
String body;
String greetings;
Email(){}
Email(Header header,String body,String greetings	){
	this.header=header;
	this.body=body;
	this.greetings=greetings;
}
}
class Header{
// Implemet the Header Class according to the specifiaction.
String from;
String to;
Header(){}
Header(String from,String to)
{
	this.from=from;
	this.to=to;
}
}


class EmailOperations{
// Implemet the Three methods specified in the specified.
	public int emailVerify(Email e){
		int count=0;
		String email1=e.header.from;
		String email2=e.header.to;
	String regex="^[_A-Za-z]"+"[_A-Za-z0-9]*"+"(\\.[_A-Za-z0-9]+)*@"+"[A-Za-z]+(\\.[A-Za-z]+)$";
	if(!(email1==null)){
		if(Pattern.matches(regex,email1	))
		count++;
	}
	if(!(email2==null)){
		if(Pattern.matches(regex,email2	))
		count++;
	}
	
	return count;
	}
	public String bodyEncryption(Email e){
		String text=e.body;
		String result="";
		if(e.body!=null) {
			StringBuilder str=new StringBuilder(text.length());
			char[] chararray=text.toCharArray();
			for(char ch:chararray){
				int ascii=(int)ch;
				if(ascii>=65 && ascii<=90 || ascii>=97 && ascii<=122) {
					ascii+=3;
					if(ascii >122 || (ascii>90 && ascii<97))
						ascii-=26;
					str.append((char)ascii);
				}
				else {
					str.append(ch);
				}
			}
			result=str.toString();
		}
		
		return result;

	}
	public String greetingMessage(Email e){
		String result="";
		String greeting=e.greetings;
		String email=e.header.from;
		String[] emailarray=null;
		if(email!=null && greeting!=null) {
			 emailarray=email.split("@");
			 result=greeting+" "+emailarray[0];
		}
		return result;

	}
}


public class Source {
	public static void main(String args[] ) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
    // You can Implement your main() to check your Program.
}
}