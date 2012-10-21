package main;

public class MdpJunitSterren implements MdpJunitDemo {

	@Override
	public String capitalize(String s) {
		s = s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
		return s;
	}

	@Override
	public boolean isEmpty(String s) {
		if(s == null || s == ""){
			return true;
		}
		else {return false;
		}
	}

	@Override
	public String join(String... strings) {
		String s = "";
		int counter = 0;
		for(String string: strings){
			counter++;
			s = s + string;
			if(counter < strings.length){
				s = s + " ";
			}
		}

		//		for(int i=0; i<strings.length; i++){
		//			s = s+strings[i];
		//			if(i< (strings.length-1)){
		//				s = s + " ";
		//			}
		//		}
		return s;
	}

	@Override
	public String reverse(String s) throws NullPointerException {
		s = new StringBuffer(s).reverse().toString();
		return s;
	}

}
