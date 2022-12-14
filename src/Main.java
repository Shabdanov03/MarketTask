import classes.Market;
import classes.Person;
import enams.Country;
import enams.Grocerys;
import service.MarketServiceImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
   public static MarketServiceImpl marketService = new MarketServiceImpl();
    public static void main(String[] args) throws Exception {

        /* Элестетип корунуздор,
сиздер маркеттен соода кылып жатасыздар.
Бир канча бара турган маркеттердин списогу болсун.
Маркетте ала турган товарлардын списогу болсун жана баалары болсун.
Анан маркеттен соода кылган сон бизге кадимкидей чек чыгып берсин.
~~~~~~ Чек ~~~~~~~~
Ким алды: "Аты"
Кайсыл маркеттен алды: "Маркет"
Список товаров: Банан, Молоко, Сыр, ...
Общая стоимость товаров:
Скидка: "Если есть акции"
Общая стоимость после скидки:
~~~~~~~~~~~~~~~~~~~
Спасибо за покупку!
Фантазияны иштетип, дагы да методторду кошсонуздар болот,
жана да кооздоп, кызыктуу логикаларды да кошсонуздар болот.
Подсказка 2 класс продуктулар enum болсун,
Продуктаны сатып алган адамдын акчасы азайып магазиндин акчасы кобоюшу керек.
Жок дегенде 10 метод ойлоп жазыныздар.   */

        List<Grocerys> grocerys = new ArrayList<>(List.of(Grocerys.BANANA,Grocerys.COOKIE,Grocerys.WATER,Grocerys.BREAD,
                Grocerys.CHOCOLATE,Grocerys.COLA,Grocerys.FISH_SEAFOOD,
                Grocerys.FOOD_FAT,Grocerys.MEAT,Grocerys.TEA,Grocerys.MILK ));

        List<Grocerys> basket = new ArrayList<>();
        List<Person> people = new ArrayList<>();
        people.add(new Person("Ilim","Shabdanov", LocalDate.of(2003,10,3),5000, Country.USA,basket));

        List<Market>markets = new ArrayList<>();
        markets.add(new Market("Globus",grocerys,2000));
        markets.add(new Market("Frunze",grocerys,0));
        markets.add(new Market("Bereke",grocerys,1000));
        markets.add(new Market("Alma",grocerys,1000));

        while (true) {
            System.out.println("""
                    1.PERSON DATABASE :
                    2.CREATED PERSON :
                    3.MARKET DATABASE :
                    4.ENTRANCE TO THE MARKET :
                    5. GET ALL PERSONS :
                    6.FIND BY PRODUCT NAME :
                    7.GET ALL MARKET :
                    8.
                    """);
            System.out.println("Enter by command :");
            int num = new Scanner(System.in).nextInt();
            switch (num){
                case 1-> System.out.println(marketService.createdDB(people));
                case 2-> System.out.println(marketService.createdPerson());
                case 3-> System.out.println(marketService.marketDB(markets));
                case 4-> System.out.println(marketService.entranceToTheMarket());
                case 5-> System.out.println(marketService.getAllPerson());
                case 6-> System.out.println(marketService.findByProductName(grocerys));
                case 7-> System.out.println(marketService.getAllMarkets(markets));
                default -> System.out.println("NO SUCH COMMAND !");
            }

        }
    }
}