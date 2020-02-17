package abc;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/*
 * PersonG.groovyをPersonG2.groovyにコピーする
 * 	変数、メソッド宣言を省略する。
 *  アクセス修飾子、型を省略し、defで宣言する。
 *       アクセス修飾子のデフォルトはpublicである。
 *   メソッド引数の型を省略する。
 * 文の区切り文字';'を省略する。
 * returnを省略する。
 */
class PersonG2 {
        def id = 1
        def name = "東田　雅宏"
        def birth = "1962/03/31"

        static def main(args) {
            def person = new PersonG2()
            person.currentProfile()
        }

        def currentProfile() {
            System.out.println("登録番号: "+ id + ", 名前: " + name + ", 年齢: " + age(birth))
        }

        def age(birthDay) {
            def b = LocalDate.parse(birthDay, DateTimeFormatter.ofPattern("yyyy/MM/dd"))
            ChronoUnit.YEARS.between(b, LocalDate.now())
        }
}