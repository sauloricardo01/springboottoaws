package br.com.erudio;

public class Greenting {

	private final Long id;
	private final String content;

	public Greenting(Long id, String content) {
		super();
		this.id = id;
		this.content = content;
	}

	public Long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

}
