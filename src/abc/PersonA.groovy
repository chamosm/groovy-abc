package abc;

class PersonA extends PersonG4 {
        def addr

        static def main(args) {
            def person = new PersonA(id : 1, name : "東田　雅宏", birth : "1962/03/31")
			person.addr = new Address(postalCode:3360974, pref:'埼玉県', city:'さいたま市', street:'緑区大崎2953-1')
            person.currentProfile()
        }

        def currentProfile() {
            super.currentProfile()
			println addr.show()
			/*
			 *  Addressオブジェクトの属性postalCodeの直接参照ではなく、
			 *  Address#getPostalCode()が呼び出されているとを確認する。
			 */
			println addr.postalCode
        }
}