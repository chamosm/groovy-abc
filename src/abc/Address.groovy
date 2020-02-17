package abc

class Address {
	def postalCode, pref, city, street

	def getPostalCode() {
		"〒" + postalCode
	}

	def show() {
		getPostalCode() + " " + pref + city + street
	}
}
