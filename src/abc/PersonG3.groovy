package abc;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/*
 * PersonG2.groovyをPersonG3.groovyにコピーする
 * 	型省略が出来るため、変数宣言を一文に纏めてみる。
 *  with()メソッドでオブジェクト属性値を与えてみる。
 *  printlnパラメタ記述で括弧を省略する。
 */
class PersonG3 {
        def id, name, birth

        static def main(args) {
            def person = new PersonG3()
            person.with { id = 1; name = "東田　雅宏"; birth = "1962/03/31" }
            person.currentProfile()
        }

        def currentProfile() {
            println "登録番号: $id, 名前: $name, 年齢: ${age(birth)}"
        }

        def age(birthDay) {
            def b = LocalDate.parse(birthDay, DateTimeFormatter.ofPattern("yyyy/MM/dd"))
            ChronoUnit.YEARS.between(b, LocalDate.now())
        }
}