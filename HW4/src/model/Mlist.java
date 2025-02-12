package model;

public class Mlist {
	private Integer id;
	private String name;
	private Integer pico;// 皮秒雷射
	private Integer frac;// 飛梭雷射
	private Integer botul;// 肉毒桿菌
	private Integer slimne;// 瘦瘦針

	public Mlist(String name, Integer pico, Integer frac, Integer botul, Integer slimne) {
		super();
		this.name = name;
		this.pico = pico;
		this.frac = frac;
		this.botul = botul;
		this.slimne = slimne;
	}

	public Mlist() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPico() {
		return pico;
	}

	public void setPico(Integer pico) {
		this.pico = pico;
	}

	public Integer getFrac() {
		return frac;
	}

	public void setFrac(Integer frac) {
		this.frac = frac;
	}

	public Integer getBotul() {
		return botul;
	}

	public void setBotul(Integer botul) {
		this.botul = botul;
	}

	public Integer getSlimne() {
		return slimne;
	}

	public void setSlimne(Integer slimne) {
		this.slimne = slimne;
	}
	

}
