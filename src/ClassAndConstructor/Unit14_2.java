package ClassAndConstructor;

public class Unit14_2 {

	public static void main(String[] args) {
		School  me=new School ();
		School.ME Me=me.new ME("老孟","平鎮高中","資處科");
		me.demo();
		Me.demoME();
	}

}
class School{
	protected String title;
	protected String name;
	public void demo(){
		System.out.print("學校名稱:"+title+", 學生名稱:"+name);
	}
	class ME{
		//機械
		protected String department;
		ME(String MEname,String MEtitle,String MEdepartment){
			name=MEname;
			title=MEtitle;
			department=MEdepartment;
		}
		public void demoME(){
			System.out.print(", 科系:"+department);
		}
	}
	class EE{
		//電機
		protected String department;
		EE(String EEname, String EEtitle,String EEdepartment){
			name=EEname;
			title=EEtitle;
			department=EEdepartment;
			
		}
		public void demoEE(){
			System.out.print("科系:"+department);
		}
		
	}
}