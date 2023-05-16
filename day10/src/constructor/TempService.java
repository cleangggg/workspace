package constructor;

public class TempService {

	private TempDTO dto = new TempDTO();
	public void up(int temp) {
	
		
		dto.setTemp(temp);
		
		
		
	}
	public void down(int temp) {
		
		dto.setTemp(temp);
		
		
		
	}
	public int  config() {
		int temp_ = dto.getTemp();
		
		return temp_;
	}
	
	
}
