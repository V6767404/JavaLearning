package by.it.yanush.belh2017.lessons.les08_2;

public class One implements Inter3{

public int a;

@Override
public void meth(Inter3 ob) {
	One o = (One)ob;
	System.out.println(o.a);
}

}
