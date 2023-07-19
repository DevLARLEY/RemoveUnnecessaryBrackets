import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Stack;

public class RemoveUnnecessaryBrackets {
    public static ScriptEngineManager m = new ScriptEngineManager();
    public static ScriptEngine p = m.getEngineByName("js");

    public static int k(String s, int a){if(s.charAt(a)!='(')return -1;
        Stack<Integer> st=new Stack<>();for(int i = a; i<s.length(); i++){
            if(s.charAt(i)=='('){st.push((int)s.charAt(i));}else if(s.charAt(i)==')'){st.pop();if(st.empty())return i;}}return -1;}

    public static String rrb(String s)throws ScriptException{  // github.com/DevLARLEY/RemoveUnnecessaryBrackets
        if(s.length()<1)return null;int j=0;String d=s;try{p.eval(s);}catch(ScriptException x){return null;}
        int r=d.length()-d.replace("(","").replace(")","").length();
        for(int b=0;b<r;b++){int o=0;int c=0;for(int a=0;a<s.length();a++){if(j>a)continue;if(s.charAt(a)=='('){o=a;c=k(s,a);break;}}
            String q=s;if(o<j||q.length()==q.replace("(","").replace(")","").length()){break;}
            String e=s.substring(0,o)+s.substring(o+1);String f=e.substring(0,c-1)+e.substring(c);
            if(p.eval(s).toString().equals(p.eval(f).toString())){s=f;}else{j++;}}return s;
    }

    public static void main(String[] args) throws ScriptException {  
        if(args.length>0){
            if(args[0].startsWith("?")&&args[0].endsWith("?")){
                String i=args[0].substring(1, args[0].length()-1);
                long t1=System.nanoTime();
                String o=rrb(i);
                long t2=System.nanoTime();
                System.out.println(i + " --[" + ((t2-t1)/1000000) + "ms]-> " + o);
            }else{
                System.out.println("The input has to be enclosed in qustion marks: ?((1+4)+3*2)?");
            }
        }else{
            System.out.println("No Argument! Example: ?((1+4)+3*2)?");
        }
    }
}
