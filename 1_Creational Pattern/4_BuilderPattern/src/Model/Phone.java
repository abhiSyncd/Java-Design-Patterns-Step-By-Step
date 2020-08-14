package Model;

public class Phone {

	private String company;
	private Integer price;
	private String singleCamera;
	private String dualCamera;
	private String fingerPrintRecognition;

	private Phone(Builder builder) {
		this.company = builder.company;
		this.price = builder.price;
		this.singleCamera = builder.singleCamera;
		this.dualCamera = builder.dualCamera;
		this.fingerPrintRecognition = builder.fingerPrintRecognition;
	}
	

	@Override
	public String toString() {
		return "Phone [company=" + company + ", price=" + price + ", singleCamera=" + singleCamera + ", dualCamera="
				+ dualCamera + ", fingerPrintRecognition=" + fingerPrintRecognition + "]";
	}


	public static class Builder {
		private String company;
		private Integer price;
		private String singleCamera;
		private String dualCamera;
		private String fingerPrintRecognition;

		public Builder() {
		}

		public Phone build() {
			return new Phone(this);
		}

		public Builder company(String company) {
			this.company = company;
			return this;
		}

		public Builder price(Integer price) {
			this.price = price;
			return this;
		}

		public Builder singleCamera(String singleCamera) {
			this.singleCamera = singleCamera;
			return this;
		}

		public Builder dualCamera(String dualCamera) {
			this.dualCamera = dualCamera;
			return this;
		}

		public Builder fingerPrintRecognition(String fingerPrintRecognition) {
			this.fingerPrintRecognition = fingerPrintRecognition;
			return this;
		}

	}
}
