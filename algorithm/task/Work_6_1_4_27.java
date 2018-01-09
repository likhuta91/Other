package algorithm.task;

/*Области, описываемые логическими выражениями
Для данных областей составить линейную программу, 
которая печатает true, если точка с координатами (х, у)
принадлежит закрашенной области, и false — в противном случае:*/

public class Work_6_1_4_27 {

	public static void main(String[] args) {
		double x=0.6;
		double y=0.6;
		boolean marker=false;

		if(x>=0&&y>=0&&x+y>=2&&x+y<=4) {
			marker=true;
		}
		if(x<=0&&y<=0&&x+y<=-2&&x+y>=-4) {
			marker=true;
		}
		if(x<=0&&y>=0&&y-x>=2&&y-x<=4) {
			marker=true;
		}				
		System.out.println(marker);
	}

}
