package com.smitsworks.toursmodule.model.otpusk;

import lombok.*;

import java.util.List;
import java.util.Map;

/**
 * tours/hotel — получение подробной информации об отеле
 * https://otpusk.api.domain/tours/hotel?hotelId=8987&access_token=ACCESS_TOKEN
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Hotel {

    /**
     * hotel : {"area":"9000","priceOperatorId":"3331","key":"a74bea0e139e68c06de07834385080e5","i":"20178","n":"Sunside Beach Hotel 4*","nm":"Sunside Beach Hotel","h":"Sunside_Beach_Hotel","hru":"Сансайд Бич Хотел,бывш. Blue Moon Beach","s":{"s":"four","n":"4*","c":"&#9733;&#9733;&#9733;&#9733;"},"ad":{"a":"Kucukgol Mevkii Buyukyer Mahallesi, Konakli, Alanya, Antalya, Turkey","ml":"info@sunsidebeachhotel.com","u":"http://www.sunsidebeachhotel.com/","ph":"Tel: +90 (242) 545 43 42, <br />\nFax: +90 (242) 545 43"},"p":{"p":"578.00","c":"eur","d":"2020-04-22","f":"ai","i":"2054775970898418","l":"8","t":"air","up":"2019-04-25 14:24:39"},"fm":{"i":"hotel","n":"Отель","vn":"Отели","vns":"Отелей","rd":"Отеля","pr":"Отеле","wh":"Отель"},"tp":{"i":"beach","n":"пляжный"},"e":{"r":{"shower":{"name":"ванна / душ","all":true,"id":false,"title":null},"hairdryer":{"name":"фен","all":true,"id":false,"title":null},"mini-bar":{"name":"мини-бар","all":true,"id":"pay","title":"платно"},"conditioning":{"name":"кондиционер","all":true,"id":false,"title":null},"tv":{"name":"кабельное/спутниковое ТВ","all":true,"id":false,"title":null},"phone":{"name":"телефон","all":true,"id":false,"title":null},"network":{"name":"интернет wi-fi","all":true,"id":"pay","title":"платно"},"terrace":{"name":"балкон/терраса","all":true,"id":false,"title":null}},"h":{"restaurant":{"id":"yes","value":"есть","title":"","name":"ресторан"},"cafe":{"id":"yes","value":"есть","title":"","name":"кафе / бар"},"outdoor_pool":{"id":"yes","value":"есть","title":"","name":"открытый бассейн"},"conference":{"id":"yes","value":"есть","title":"","name":"конференц-зал / банкетный зал"},"business":{"id":"pay","value":"<font color=\"red\" title=\"платно\">$<\/font>","title":"платно","name":"бизнес-центр"},"parking":{"id":"yes","value":"есть","title":"","name":"автостоянка"},"rent_car":{"id":"yes","value":"есть","title":"","name":"прокат автомобилей"},"safe":{"id":"yes","value":"есть","title":"","name":"сейф"},"elevator":{"id":"yes","value":"есть","title":"","name":"лифт"},"laundry":{"id":"yes","value":"есть","title":"","name":"прачечная"},"salon":{"id":"yes","value":"есть","title":"","name":"парикмахерская / салон красоты"},"doctor":{"id":"pay","value":"<font color=\"red\" title=\"платно\">$<\/font>","title":"платно","name":"врач"},"pets":{"id":"pay","value":"<font color=\"red\" title=\"платно\">$<\/font>","title":"платно","name":"размещение с животными"},"conversion":{"id":"yes","value":"есть","title":"","name":"обмен валют"},"atm":{"id":"yes","value":"есть","title":"","name":"банкомат"},"visa":{"id":"yes","value":"есть","title":"","name":"оплата платежными картами"}},"c":{"childpool":{"id":"yes","value":"есть","title":"","name":"детский бассейн"},"playground":{"id":"yes","value":"есть","title":"","name":"детская площадка"},"nursery":{"id":"yes","value":"есть","title":"","name":"детский клуб"},"childmenu":{"id":"yes","value":"есть","title":"","name":"детское меню в ресторане"},"highchairs":{"id":"yes","value":"есть","title":"","name":"детские стульчики в ресторане"},"crib":{"id":"free","value":"<strike style=\"color:green\" title=\"бесплатно\">$<\/strike>","title":"бесплатно","name":"детская кроватка"},"nurse":{"id":"pay","value":"<font color=\"red\" title=\"платно\">$<\/font>","title":"платно","name":"няня"}},"s":{"sauna":{"id":"free","value":"<strike style=\"color:green\" title=\"бесплатно\">$<\/strike>","title":"бесплатно","name":"сауна / баня / хамам"},"spa":{"id":"yes","value":"есть","title":"","name":"Спа или велнес-центр"},"billiards":{"id":"pay","value":"<font color=\"red\" title=\"платно\">$<\/font>","title":"платно","name":"бильярд"},"table_tennis":{"id":"yes","value":"есть","title":"","name":"настольный теннис"},"tennis_court":{"id":"yes","value":"есть","title":"","name":"теннисный корт"},"volleyball":{"id":"free","value":"<strike style=\"color:green\" title=\"бесплатно\">$<\/strike>","title":"бесплатно","name":"волейбол"},"bikes":{"id":"pay","value":"<font color=\"red\" title=\"платно\">$<\/font>","title":"платно","name":"прокат велосипедов"},"fitness":{"id":"free","value":"<strike style=\"color:green\" title=\"бесплатно\">$<\/strike>","title":"бесплатно","name":"тренажерный зал"},"aerobics":{"id":"free","value":"<strike style=\"color:green\" title=\"бесплатно\">$<\/strike>","title":"бесплатно","name":"аэробика"},"aquapark":{"id":"yes","value":"есть","title":"","name":"аквапарк или горки"},"water_sports":{"id":"yes","value":"есть","title":"","name":"водные развлечения"},"discotheque":{"id":"pay","value":"<font color=\"red\" title=\"платно\">$<\/font>","title":"платно","name":"диско-клуб"},"animation":{"id":"yes","value":"есть","title":"","name":"анимация"}},"b":{"two_line_beach":{"id":"yes","value":"есть","title":"","name":"отель на 2-й пляжной линии"},"own":{"id":"yes","value":"есть","title":"","name":"собственный пляж"},"sandy_pebble":{"id":"yes","value":"есть","title":"","name":"песчано-галечный пляж"},"chairs":{"id":"free","value":"<strike style=\"color:green\" title=\"бесплатно\">$<\/strike>","title":"бесплатно","name":"шезлонги"},"umbrella":{"id":"free","value":"<strike style=\"color:green\" title=\"бесплатно\">$<\/strike>","title":"бесплатно","name":"зонтики"},"towels":{"id":"yes","value":"есть","title":"","name":"пляжные полотенца"}}},"o":{"r":[{"id":"356623","name":"Family Room","services":{"shower":{"text":"ванна / душ","cls":"yes","title":""},"hairdryer":{"text":"фен","cls":"yes","title":""},"mini-bar":{"text":"мини-бар","cls":"pay","title":"платно"},"conditioning":{"text":"кондиционер","cls":"yes","title":""},"tv":{"text":"кабельное/спутниковое ТВ","cls":"yes","title":""},"phone":{"text":"телефон","cls":"yes","title":""},"network":{"text":"интернет wi-fi","cls":"pay","title":"платно"},"terrace":{"text":"балкон/терраса","cls":"yes","title":""}},"description":"","places":"6","images":[]},{"id":"356621","name":"Standard Pool View Room","services":{"shower":{"text":"ванна / душ","cls":"yes","title":""},"hairdryer":{"text":"фен","cls":"yes","title":""},"mini-bar":{"text":"мини-бар","cls":"pay","title":"платно"},"conditioning":{"text":"кондиционер","cls":"yes","title":""},"tv":{"text":"кабельное/спутниковое ТВ","cls":"yes","title":""},"phone":{"text":"телефон","cls":"yes","title":""},"network":{"text":"интернет wi-fi","cls":"pay","title":"платно"},"terrace":{"text":"балкон/терраса","cls":"yes","title":""}},"description":"","places":"0","images":[]},{"id":"35174","name":"Standard Room","services":{"shower":{"text":"ванна / душ","cls":"yes","title":""},"hairdryer":{"text":"фен","cls":"yes","title":""},"mini-bar":{"text":"мини-бар","cls":"pay","title":"платно"},"conditioning":{"text":"кондиционер","cls":"yes","title":""},"tv":{"text":"кабельное/спутниковое ТВ","cls":"yes","title":""},"phone":{"text":"телефон","cls":"yes","title":""},"network":{"text":"интернет wi-fi","cls":"pay","title":"платно"},"terrace":{"text":"балкон/терраса","cls":"yes","title":""}},"description":"","places":"5","images":[{}]}],"b":"Пляж в 150 м, между пляжем и отелем есть дорога, есть подземный переход. Протяжённость \u2013 80 м. Бар на пляже.","bs":{"two_line_beach":"yes","own":"yes","sandy_pebble":"yes","chairs":"free","umbrella":"free","towels":"yes"},"s":"1 водная горка, часы работы 10:00-11:30/15:00-16:30.","ss":{"sauna":"free","spa":"yes","billiards":"pay","table_tennis":"yes","tennis_court":"yes","volleyball":"free","bikes":"pay","fitness":"free","aerobics":"free","aquapark":"yes","water_sports":"yes","discotheque":"pay","animation":"yes"},"hs":{"restaurant":"yes","cafe":"yes","outdoor_pool":"yes","conference":"yes","business":"pay","parking":"yes","rent_car":"yes","safe":"yes","wifi":"","elevator":"yes","laundry":"yes","salon":"yes","doctor":"pay","pets":"pay","transfer":"","conversion":"yes","atm":"yes","visa":"yes"},"c":"Мини-клуб для детей в возрасте от 4 до 12 лет, часы работы: с 10:00-12:00/15:00-17:00. <br />\nАренда детских колясок (платно).","cs":{"childpool":"yes","playground":"yes","nursery":"yes","childmenu":"yes","highchairs":"yes","crib":"free","nurse":"pay"},"ds":"Всего 110 номеров в двух пятиэтажных зданиях.","fh":"Wi-Fi (платно). <br />\nЗавтрак 07:30-09:30, обед 12:30-14:00, чай/выпечка (у бассейна) 17:00-18:00, ужин 19:00-21:00. Шведский стол. <br />\nБар у бассейна, 10:00-23:00. <br />\nБар на пляже, 10:00-18:00 (предлагаются безалкогольные напитки). <br />\n1 открытый бассейн, площадь 126 кв.м, часы работы: 08:00-18:00.","di":"12 км от г. Алания. 110 км от аэропорта Анталии.","dc":"Отель расположен рядом с посёлком Конаклы, через дорогу от пляжа. Построен в 1996 году, последняя реновация проведена в 2017 году. Отель состоит из двух пятиэтажных корпусов. Подойдёт для экономичного семейного и молодёжного отдыха."},"c":{"i":"953","c":"alanja","n":"Алания","rd":"Алании","vn":"Аланию"},"t":{"i":"115","c":"turkey","cd":"tr","n":"Турция","rd":"Турции","vn":"Турцию"},"f":["00/02/92/98/2929881.jpg","00/02/92/99/2929901.jpg","00/02/92/99/2929906.jpg","00/02/92/99/2929976.jpg","00/02/92/98/2929891.jpg","00/02/92/98/2929896.jpg","00/02/92/99/2929916.jpg","00/02/92/99/2929921.jpg","00/02/92/98/2929886.jpg","00/02/92/99/2929911.jpg","00/02/92/99/2929971.jpg","00/02/92/99/2929981.jpg","00/02/92/99/2929926.jpg","00/02/92/99/2929966.jpg"],"fc":14,"r":2.7,"ri":{"people":17,"children":17,"seniors":16,"busines":1,"single":8},"tr":"2.6755","vi":"a74bea0e139e68c06de07834385080e5","v":"84","vs":{"1":{"name":"номера","vote":2.9,"count":52},"2":{"name":"сервис","vote":2.6,"count":51},"3":{"name":"чистота","vote":2.7,"count":52},"4":{"name":"питание","vote":2.8,"count":52},"5":{"name":"инфраструктура","vote":3.1,"count":52}},"watermark":"","ag":{"n":"Море Туров Кривой Рог на Вечернем","a":"","o":[{"id":8806,"city":"Кривой Рог","address":"Ивана Авраменка, 3"}]}}
     * api_version : 2.4
     * time : 0.3859
     */

    private HotelBean hotel;
    private String api_version;
    private double time;

    @Getter
    @Setter
    @EqualsAndHashCode
    @ToString
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class HotelBean {
        /**
         * area : 9000
         * priceOperatorId : 3331
         * key : a74bea0e139e68c06de07834385080e5
         * i : 20178
         * n : Sunside Beach Hotel 4*
         * nm : Sunside Beach Hotel
         * h : Sunside_Beach_Hotel
         * hru : Сансайд Бич Хотел,бывш. Blue Moon Beach
         * s : {"s":"four","n":"4*","c":"&#9733;&#9733;&#9733;&#9733;"}
         * ad : {"a":"Kucukgol Mevkii Buyukyer Mahallesi, Konakli, Alanya, Antalya, Turkey","ml":"info@sunsidebeachhotel.com","u":"http://www.sunsidebeachhotel.com/","ph":"Tel: +90 (242) 545 43 42, <br />\nFax: +90 (242) 545 43"}
         * p : {"p":"578.00","c":"eur","d":"2020-04-22","f":"ai","i":"2054775970898418","l":"8","t":"air","up":"2019-04-25 14:24:39"}
         * fm : {"i":"hotel","n":"Отель","vn":"Отели","vns":"Отелей","rd":"Отеля","pr":"Отеле","wh":"Отель"}
         * tp : {"i":"beach","n":"пляжный"}
         * e : {"r":{"shower":{"name":"ванна / душ","all":true,"id":false,"title":null},"hairdryer":{"name":"фен","all":true,"id":false,"title":null},"mini-bar":{"name":"мини-бар","all":true,"id":"pay","title":"платно"},"conditioning":{"name":"кондиционер","all":true,"id":false,"title":null},"tv":{"name":"кабельное/спутниковое ТВ","all":true,"id":false,"title":null},"phone":{"name":"телефон","all":true,"id":false,"title":null},"network":{"name":"интернет wi-fi","all":true,"id":"pay","title":"платно"},"terrace":{"name":"балкон/терраса","all":true,"id":false,"title":null}},"h":{"restaurant":{"id":"yes","value":"есть","title":"","name":"ресторан"},"cafe":{"id":"yes","value":"есть","title":"","name":"кафе / бар"},"outdoor_pool":{"id":"yes","value":"есть","title":"","name":"открытый бассейн"},"conference":{"id":"yes","value":"есть","title":"","name":"конференц-зал / банкетный зал"},"business":{"id":"pay","value":"<font color=\"red\" title=\"платно\">$<\/font>","title":"платно","name":"бизнес-центр"},"parking":{"id":"yes","value":"есть","title":"","name":"автостоянка"},"rent_car":{"id":"yes","value":"есть","title":"","name":"прокат автомобилей"},"safe":{"id":"yes","value":"есть","title":"","name":"сейф"},"elevator":{"id":"yes","value":"есть","title":"","name":"лифт"},"laundry":{"id":"yes","value":"есть","title":"","name":"прачечная"},"salon":{"id":"yes","value":"есть","title":"","name":"парикмахерская / салон красоты"},"doctor":{"id":"pay","value":"<font color=\"red\" title=\"платно\">$<\/font>","title":"платно","name":"врач"},"pets":{"id":"pay","value":"<font color=\"red\" title=\"платно\">$<\/font>","title":"платно","name":"размещение с животными"},"conversion":{"id":"yes","value":"есть","title":"","name":"обмен валют"},"atm":{"id":"yes","value":"есть","title":"","name":"банкомат"},"visa":{"id":"yes","value":"есть","title":"","name":"оплата платежными картами"}},"c":{"childpool":{"id":"yes","value":"есть","title":"","name":"детский бассейн"},"playground":{"id":"yes","value":"есть","title":"","name":"детская площадка"},"nursery":{"id":"yes","value":"есть","title":"","name":"детский клуб"},"childmenu":{"id":"yes","value":"есть","title":"","name":"детское меню в ресторане"},"highchairs":{"id":"yes","value":"есть","title":"","name":"детские стульчики в ресторане"},"crib":{"id":"free","value":"<strike style=\"color:green\" title=\"бесплатно\">$<\/strike>","title":"бесплатно","name":"детская кроватка"},"nurse":{"id":"pay","value":"<font color=\"red\" title=\"платно\">$<\/font>","title":"платно","name":"няня"}},"s":{"sauna":{"id":"free","value":"<strike style=\"color:green\" title=\"бесплатно\">$<\/strike>","title":"бесплатно","name":"сауна / баня / хамам"},"spa":{"id":"yes","value":"есть","title":"","name":"Спа или велнес-центр"},"billiards":{"id":"pay","value":"<font color=\"red\" title=\"платно\">$<\/font>","title":"платно","name":"бильярд"},"table_tennis":{"id":"yes","value":"есть","title":"","name":"настольный теннис"},"tennis_court":{"id":"yes","value":"есть","title":"","name":"теннисный корт"},"volleyball":{"id":"free","value":"<strike style=\"color:green\" title=\"бесплатно\">$<\/strike>","title":"бесплатно","name":"волейбол"},"bikes":{"id":"pay","value":"<font color=\"red\" title=\"платно\">$<\/font>","title":"платно","name":"прокат велосипедов"},"fitness":{"id":"free","value":"<strike style=\"color:green\" title=\"бесплатно\">$<\/strike>","title":"бесплатно","name":"тренажерный зал"},"aerobics":{"id":"free","value":"<strike style=\"color:green\" title=\"бесплатно\">$<\/strike>","title":"бесплатно","name":"аэробика"},"aquapark":{"id":"yes","value":"есть","title":"","name":"аквапарк или горки"},"water_sports":{"id":"yes","value":"есть","title":"","name":"водные развлечения"},"discotheque":{"id":"pay","value":"<font color=\"red\" title=\"платно\">$<\/font>","title":"платно","name":"диско-клуб"},"animation":{"id":"yes","value":"есть","title":"","name":"анимация"}},"b":{"two_line_beach":{"id":"yes","value":"есть","title":"","name":"отель на 2-й пляжной линии"},"own":{"id":"yes","value":"есть","title":"","name":"собственный пляж"},"sandy_pebble":{"id":"yes","value":"есть","title":"","name":"песчано-галечный пляж"},"chairs":{"id":"free","value":"<strike style=\"color:green\" title=\"бесплатно\">$<\/strike>","title":"бесплатно","name":"шезлонги"},"umbrella":{"id":"free","value":"<strike style=\"color:green\" title=\"бесплатно\">$<\/strike>","title":"бесплатно","name":"зонтики"},"towels":{"id":"yes","value":"есть","title":"","name":"пляжные полотенца"}}}
         * o : {"r":[{"id":"356623","name":"Family Room","services":{"shower":{"text":"ванна / душ","cls":"yes","title":""},"hairdryer":{"text":"фен","cls":"yes","title":""},"mini-bar":{"text":"мини-бар","cls":"pay","title":"платно"},"conditioning":{"text":"кондиционер","cls":"yes","title":""},"tv":{"text":"кабельное/спутниковое ТВ","cls":"yes","title":""},"phone":{"text":"телефон","cls":"yes","title":""},"network":{"text":"интернет wi-fi","cls":"pay","title":"платно"},"terrace":{"text":"балкон/терраса","cls":"yes","title":""}},"description":"","places":"6","images":[]},{"id":"356621","name":"Standard Pool View Room","services":{"shower":{"text":"ванна / душ","cls":"yes","title":""},"hairdryer":{"text":"фен","cls":"yes","title":""},"mini-bar":{"text":"мини-бар","cls":"pay","title":"платно"},"conditioning":{"text":"кондиционер","cls":"yes","title":""},"tv":{"text":"кабельное/спутниковое ТВ","cls":"yes","title":""},"phone":{"text":"телефон","cls":"yes","title":""},"network":{"text":"интернет wi-fi","cls":"pay","title":"платно"},"terrace":{"text":"балкон/терраса","cls":"yes","title":""}},"description":"","places":"0","images":[]},{"id":"35174","name":"Standard Room","services":{"shower":{"text":"ванна / душ","cls":"yes","title":""},"hairdryer":{"text":"фен","cls":"yes","title":""},"mini-bar":{"text":"мини-бар","cls":"pay","title":"платно"},"conditioning":{"text":"кондиционер","cls":"yes","title":""},"tv":{"text":"кабельное/спутниковое ТВ","cls":"yes","title":""},"phone":{"text":"телефон","cls":"yes","title":""},"network":{"text":"интернет wi-fi","cls":"pay","title":"платно"},"terrace":{"text":"балкон/терраса","cls":"yes","title":""}},"description":"","places":"5","images":[{}]}],"b":"Пляж в 150 м, между пляжем и отелем есть дорога, есть подземный переход. Протяжённость \u2013 80 м. Бар на пляже.","bs":{"two_line_beach":"yes","own":"yes","sandy_pebble":"yes","chairs":"free","umbrella":"free","towels":"yes"},"s":"1 водная горка, часы работы 10:00-11:30/15:00-16:30.","ss":{"sauna":"free","spa":"yes","billiards":"pay","table_tennis":"yes","tennis_court":"yes","volleyball":"free","bikes":"pay","fitness":"free","aerobics":"free","aquapark":"yes","water_sports":"yes","discotheque":"pay","animation":"yes"},"hs":{"restaurant":"yes","cafe":"yes","outdoor_pool":"yes","conference":"yes","business":"pay","parking":"yes","rent_car":"yes","safe":"yes","wifi":"","elevator":"yes","laundry":"yes","salon":"yes","doctor":"pay","pets":"pay","transfer":"","conversion":"yes","atm":"yes","visa":"yes"},"c":"Мини-клуб для детей в возрасте от 4 до 12 лет, часы работы: с 10:00-12:00/15:00-17:00. <br />\nАренда детских колясок (платно).","cs":{"childpool":"yes","playground":"yes","nursery":"yes","childmenu":"yes","highchairs":"yes","crib":"free","nurse":"pay"},"ds":"Всего 110 номеров в двух пятиэтажных зданиях.","fh":"Wi-Fi (платно). <br />\nЗавтрак 07:30-09:30, обед 12:30-14:00, чай/выпечка (у бассейна) 17:00-18:00, ужин 19:00-21:00. Шведский стол. <br />\nБар у бассейна, 10:00-23:00. <br />\nБар на пляже, 10:00-18:00 (предлагаются безалкогольные напитки). <br />\n1 открытый бассейн, площадь 126 кв.м, часы работы: 08:00-18:00.","di":"12 км от г. Алания. 110 км от аэропорта Анталии.","dc":"Отель расположен рядом с посёлком Конаклы, через дорогу от пляжа. Построен в 1996 году, последняя реновация проведена в 2017 году. Отель состоит из двух пятиэтажных корпусов. Подойдёт для экономичного семейного и молодёжного отдыха."}
         * c : {"i":"953","c":"alanja","n":"Алания","rd":"Алании","vn":"Аланию"}
         * t : {"i":"115","c":"turkey","cd":"tr","n":"Турция","rd":"Турции","vn":"Турцию"}
         * f : ["00/02/92/98/2929881.jpg","00/02/92/99/2929901.jpg","00/02/92/99/2929906.jpg","00/02/92/99/2929976.jpg","00/02/92/98/2929891.jpg","00/02/92/98/2929896.jpg","00/02/92/99/2929916.jpg","00/02/92/99/2929921.jpg","00/02/92/98/2929886.jpg","00/02/92/99/2929911.jpg","00/02/92/99/2929971.jpg","00/02/92/99/2929981.jpg","00/02/92/99/2929926.jpg","00/02/92/99/2929966.jpg"]
         * fc : 14
         * r : 2.7
         * ri : {"people":17,"children":17,"seniors":16,"busines":1,"single":8}
         * tr : 2.6755
         * vi : a74bea0e139e68c06de07834385080e5
         * v : 84
         * vs : {"1":{"name":"номера","vote":2.9,"count":52},"2":{"name":"сервис","vote":2.6,"count":51},"3":{"name":"чистота","vote":2.7,"count":52},"4":{"name":"питание","vote":2.8,"count":52},"5":{"name":"инфраструктура","vote":3.1,"count":52}}
         * watermark :
         * ag : {"n":"Море Туров Кривой Рог на Вечернем","a":"","o":[{"id":8806,"city":"Кривой Рог","address":"Ивана Авраменка, 3"}]}
         */

        private String area;
        private String priceOperatorId;
        private String key;
        private String i;
        private String n;
        private String nm;
        private String h;
        private String hru;
        private Map<String, String> s;
        private Map<String, String> ad;
        private Map<String, String> p;
        private Map<String, String> fm;
        private Map<String, String> tp;
        private EBean e;
        private OBean o;
        private CBeanX c;
        private TBean t;
        private int fc;
        private double r;
        private RiBean ri;
        private String tr;
        private String vi;
        private String v;
        private Map<String, VsOptionBean> vs;
        private String watermark;
        private AgBean ag;
        private List<String> f;

        @Getter
        @Setter
        @EqualsAndHashCode
        @ToString
        @Builder
        @NoArgsConstructor
        @AllArgsConstructor
        public static class EBean {
            /**
             * r : {"shower":{"name":"ванна / душ","all":true,"id":false,"title":null},"hairdryer":{"name":"фен","all":true,"id":false,"title":null},"mini-bar":{"name":"мини-бар","all":true,"id":"pay","title":"платно"},"conditioning":{"name":"кондиционер","all":true,"id":false,"title":null},"tv":{"name":"кабельное/спутниковое ТВ","all":true,"id":false,"title":null},"phone":{"name":"телефон","all":true,"id":false,"title":null},"network":{"name":"интернет wi-fi","all":true,"id":"pay","title":"платно"},"terrace":{"name":"балкон/терраса","all":true,"id":false,"title":null}}
             * h : {"restaurant":{"id":"yes","value":"есть","title":"","name":"ресторан"},"cafe":{"id":"yes","value":"есть","title":"","name":"кафе / бар"},"outdoor_pool":{"id":"yes","value":"есть","title":"","name":"открытый бассейн"},"conference":{"id":"yes","value":"есть","title":"","name":"конференц-зал / банкетный зал"},"business":{"id":"pay","value":"<font color=\"red\" title=\"платно\">$<\/font>","title":"платно","name":"бизнес-центр"},"parking":{"id":"yes","value":"есть","title":"","name":"автостоянка"},"rent_car":{"id":"yes","value":"есть","title":"","name":"прокат автомобилей"},"safe":{"id":"yes","value":"есть","title":"","name":"сейф"},"elevator":{"id":"yes","value":"есть","title":"","name":"лифт"},"laundry":{"id":"yes","value":"есть","title":"","name":"прачечная"},"salon":{"id":"yes","value":"есть","title":"","name":"парикмахерская / салон красоты"},"doctor":{"id":"pay","value":"<font color=\"red\" title=\"платно\">$<\/font>","title":"платно","name":"врач"},"pets":{"id":"pay","value":"<font color=\"red\" title=\"платно\">$<\/font>","title":"платно","name":"размещение с животными"},"conversion":{"id":"yes","value":"есть","title":"","name":"обмен валют"},"atm":{"id":"yes","value":"есть","title":"","name":"банкомат"},"visa":{"id":"yes","value":"есть","title":"","name":"оплата платежными картами"}}
             * c : {"childpool":{"id":"yes","value":"есть","title":"","name":"детский бассейн"},"playground":{"id":"yes","value":"есть","title":"","name":"детская площадка"},"nursery":{"id":"yes","value":"есть","title":"","name":"детский клуб"},"childmenu":{"id":"yes","value":"есть","title":"","name":"детское меню в ресторане"},"highchairs":{"id":"yes","value":"есть","title":"","name":"детские стульчики в ресторане"},"crib":{"id":"free","value":"<strike style=\"color:green\" title=\"бесплатно\">$<\/strike>","title":"бесплатно","name":"детская кроватка"},"nurse":{"id":"pay","value":"<font color=\"red\" title=\"платно\">$<\/font>","title":"платно","name":"няня"}}
             * s : {"sauna":{"id":"free","value":"<strike style=\"color:green\" title=\"бесплатно\">$<\/strike>","title":"бесплатно","name":"сауна / баня / хамам"},"spa":{"id":"yes","value":"есть","title":"","name":"Спа или велнес-центр"},"billiards":{"id":"pay","value":"<font color=\"red\" title=\"платно\">$<\/font>","title":"платно","name":"бильярд"},"table_tennis":{"id":"yes","value":"есть","title":"","name":"настольный теннис"},"tennis_court":{"id":"yes","value":"есть","title":"","name":"теннисный корт"},"volleyball":{"id":"free","value":"<strike style=\"color:green\" title=\"бесплатно\">$<\/strike>","title":"бесплатно","name":"волейбол"},"bikes":{"id":"pay","value":"<font color=\"red\" title=\"платно\">$<\/font>","title":"платно","name":"прокат велосипедов"},"fitness":{"id":"free","value":"<strike style=\"color:green\" title=\"бесплатно\">$<\/strike>","title":"бесплатно","name":"тренажерный зал"},"aerobics":{"id":"free","value":"<strike style=\"color:green\" title=\"бесплатно\">$<\/strike>","title":"бесплатно","name":"аэробика"},"aquapark":{"id":"yes","value":"есть","title":"","name":"аквапарк или горки"},"water_sports":{"id":"yes","value":"есть","title":"","name":"водные развлечения"},"discotheque":{"id":"pay","value":"<font color=\"red\" title=\"платно\">$<\/font>","title":"платно","name":"диско-клуб"},"animation":{"id":"yes","value":"есть","title":"","name":"анимация"}}
             * b : {"two_line_beach":{"id":"yes","value":"есть","title":"","name":"отель на 2-й пляжной линии"},"own":{"id":"yes","value":"есть","title":"","name":"собственный пляж"},"sandy_pebble":{"id":"yes","value":"есть","title":"","name":"песчано-галечный пляж"},"chairs":{"id":"free","value":"<strike style=\"color:green\" title=\"бесплатно\">$<\/strike>","title":"бесплатно","name":"шезлонги"},"umbrella":{"id":"free","value":"<strike style=\"color:green\" title=\"бесплатно\">$<\/strike>","title":"бесплатно","name":"зонтики"},"towels":{"id":"yes","value":"есть","title":"","name":"пляжные полотенца"}}
             */

            private Map<String, ROptionBean> r;
            private Map<String, HOptionBean> h;
            private Map<String, HOptionBean> c;
            private Map<String, HOptionBean> s;
            private Map<String, HOptionBean> b;

            @Getter
            @Setter
            @EqualsAndHashCode
            @ToString
            @NoArgsConstructor
            @AllArgsConstructor
            @Builder
            public static class ROptionBean {
                /**
                 * name : ванна / душ
                 * all : true
                 * id : false
                 * title : null
                 */

                private String name;
                private boolean all;
                private String id;
                private Object title;
            }

            @Getter
            @Setter
            @EqualsAndHashCode
            @ToString
            @NoArgsConstructor
            @AllArgsConstructor
            @Builder
            public static class HOptionBean {
                /**
                 * id : yes
                 * value : есть
                 * title :
                 * name : ресторан
                 */

                private String id;
                private String value;
                private String title;
                private String name;
            }
        }

        @Getter
        @Setter
        @EqualsAndHashCode
        @ToString
        @Builder
        @NoArgsConstructor
        @AllArgsConstructor
        public static class OBean {
            /**
             * r : [{"id":"356623","name":"Family Room","services":{"shower":{"text":"ванна / душ","cls":"yes","title":""},"hairdryer":{"text":"фен","cls":"yes","title":""},"mini-bar":{"text":"мини-бар","cls":"pay","title":"платно"},"conditioning":{"text":"кондиционер","cls":"yes","title":""},"tv":{"text":"кабельное/спутниковое ТВ","cls":"yes","title":""},"phone":{"text":"телефон","cls":"yes","title":""},"network":{"text":"интернет wi-fi","cls":"pay","title":"платно"},"terrace":{"text":"балкон/терраса","cls":"yes","title":""}},"description":"","places":"6","images":[]},{"id":"356621","name":"Standard Pool View Room","services":{"shower":{"text":"ванна / душ","cls":"yes","title":""},"hairdryer":{"text":"фен","cls":"yes","title":""},"mini-bar":{"text":"мини-бар","cls":"pay","title":"платно"},"conditioning":{"text":"кондиционер","cls":"yes","title":""},"tv":{"text":"кабельное/спутниковое ТВ","cls":"yes","title":""},"phone":{"text":"телефон","cls":"yes","title":""},"network":{"text":"интернет wi-fi","cls":"pay","title":"платно"},"terrace":{"text":"балкон/терраса","cls":"yes","title":""}},"description":"","places":"0","images":[]},{"id":"35174","name":"Standard Room","services":{"shower":{"text":"ванна / душ","cls":"yes","title":""},"hairdryer":{"text":"фен","cls":"yes","title":""},"mini-bar":{"text":"мини-бар","cls":"pay","title":"платно"},"conditioning":{"text":"кондиционер","cls":"yes","title":""},"tv":{"text":"кабельное/спутниковое ТВ","cls":"yes","title":""},"phone":{"text":"телефон","cls":"yes","title":""},"network":{"text":"интернет wi-fi","cls":"pay","title":"платно"},"terrace":{"text":"балкон/терраса","cls":"yes","title":""}},"description":"","places":"5","images":[{}]}]
             * b : Пляж в 150 м, между пляжем и отелем есть дорога, есть подземный переход. Протяжённость – 80 м. Бар на пляже.
             * bs : {"two_line_beach":"yes","own":"yes","sandy_pebble":"yes","chairs":"free","umbrella":"free","towels":"yes"}
             * s : 1 водная горка, часы работы 10:00-11:30/15:00-16:30.
             * ss : {"sauna":"free","spa":"yes","billiards":"pay","table_tennis":"yes","tennis_court":"yes","volleyball":"free","bikes":"pay","fitness":"free","aerobics":"free","aquapark":"yes","water_sports":"yes","discotheque":"pay","animation":"yes"}
             * hs : {"restaurant":"yes","cafe":"yes","outdoor_pool":"yes","conference":"yes","business":"pay","parking":"yes","rent_car":"yes","safe":"yes","wifi":"","elevator":"yes","laundry":"yes","salon":"yes","doctor":"pay","pets":"pay","transfer":"","conversion":"yes","atm":"yes","visa":"yes"}
             * c : Мини-клуб для детей в возрасте от 4 до 12 лет, часы работы: с 10:00-12:00/15:00-17:00. <br />
             * Аренда детских колясок (платно).
             * cs : {"childpool":"yes","playground":"yes","nursery":"yes","childmenu":"yes","highchairs":"yes","crib":"free","nurse":"pay"}
             * ds : Всего 110 номеров в двух пятиэтажных зданиях.
             * fh : Wi-Fi (платно). <br />
             * Завтрак 07:30-09:30, обед 12:30-14:00, чай/выпечка (у бассейна) 17:00-18:00, ужин 19:00-21:00. Шведский стол. <br />
             * Бар у бассейна, 10:00-23:00. <br />
             * Бар на пляже, 10:00-18:00 (предлагаются безалкогольные напитки). <br />
             * 1 открытый бассейн, площадь 126 кв.м, часы работы: 08:00-18:00.
             * di : 12 км от г. Алания. 110 км от аэропорта Анталии.
             * dc : Отель расположен рядом с посёлком Конаклы, через дорогу от пляжа. Построен в 1996 году, последняя реновация проведена в 2017 году. Отель состоит из двух пятиэтажных корпусов. Подойдёт для экономичного семейного и молодёжного отдыха.
             */

            private List<RBeanX> r;
            private String b;
            private Map<String, String> bs;
            private String s;
            private Map<String, String> ss;
            private Map<String, String> hs;
            private String c;
            private Map<String, String> cs;
            private String ds;
            private String fh;
            private String di;
            private String dc;

            @Getter
            @Setter
            @EqualsAndHashCode
            @ToString
            @Builder
            @NoArgsConstructor
            @AllArgsConstructor
            public static class RBeanX {
                /**
                 * id : 356623
                 * name : Family Room
                 * services : {"shower":{"text":"ванна / душ","cls":"yes","title":""},"hairdryer":{"text":"фен","cls":"yes","title":""},"mini-bar":{"text":"мини-бар","cls":"pay","title":"платно"},"conditioning":{"text":"кондиционер","cls":"yes","title":""},"tv":{"text":"кабельное/спутниковое ТВ","cls":"yes","title":""},"phone":{"text":"телефон","cls":"yes","title":""},"network":{"text":"интернет wi-fi","cls":"pay","title":"платно"},"terrace":{"text":"балкон/терраса","cls":"yes","title":""}}
                 * description :
                 * places : 6
                 * images : []
                 */

                private String id;
                private String name;
                private Map<String, ServicesBean> services;
                private String description;
                private String places;
                private List<Object> images;

                @Getter
                @Setter
                @EqualsAndHashCode
                @ToString
                @NoArgsConstructor
                @AllArgsConstructor
                @Builder
                public static class ServicesBean {
                    /**
                     * text : ванна / душ
                     * cls : yes
                     * title :
                     */

                    private String text;
                    private String cls;
                    private String title;
                }
            }
        }

        @Getter
        @Setter
        @EqualsAndHashCode
        @ToString
        @NoArgsConstructor
        @AllArgsConstructor
        @Builder
        public static class VsOptionBean {
            /**
             * name : номера
             * vote : 2.9
             * count : 52
             */

            private String name;
            private double vote;
            private int count;

        }

        @Getter
        @Setter
        @EqualsAndHashCode
        @ToString
        @NoArgsConstructor
        @AllArgsConstructor
        @Builder
        public static class CBeanX {
            /**
             * i : 953
             * c : alanja
             * n : Алания
             * rd : Алании
             * vn : Аланию
             */

            private String i;
            private String c;
            private String n;
            private String rd;
            private String vn;
        }

        @Getter
        @Setter
        @EqualsAndHashCode
        @ToString
        @NoArgsConstructor
        @AllArgsConstructor
        @Builder
        public static class TBean {
            /**
             * i : 115
             * c : turkey
             * cd : tr
             * n : Турция
             * rd : Турции
             * vn : Турцию
             */

            private String i;
            private String c;
            private String cd;
            private String n;
            private String rd;
            private String vn;
        }

        @Getter
        @Setter
        @EqualsAndHashCode
        @ToString
        @NoArgsConstructor
        @AllArgsConstructor
        @Builder
        public static class RiBean {
            /**
             * people : 17
             * children : 17
             * seniors : 16
             * busines : 1
             * single : 8
             */

            private int people;
            private int children;
            private int seniors;
            private int busines;
            private int single;
        }

        @Getter
        @Setter
        @EqualsAndHashCode
        @ToString
        @NoArgsConstructor
        @AllArgsConstructor
        @Builder
        public static class AgBean {
            /**
             * n : Море Туров Кривой Рог на Вечернем
             * a :
             * o : [{"id":8806,"city":"Кривой Рог","address":"Ивана Авраменка, 3"}]
             */

            private String n;
            private String a;
            private List<OBeanX> o;

            @Getter
            @Setter
            @EqualsAndHashCode
            @ToString
            @NoArgsConstructor
            @AllArgsConstructor
            @Builder
            public static class OBeanX {
                /**
                 * id : 8806
                 * city : Кривой Рог
                 * address : Ивана Авраменка, 3
                 */

                private int id;
                private String city;
                private String address;
            }
        }
    }
}
