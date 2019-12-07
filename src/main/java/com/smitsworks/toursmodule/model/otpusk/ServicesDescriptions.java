package com.smitsworks.toursmodule.model.otpusk;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.util.Map;

/**
 * tours/services - описание сервисов отелей (статические данные)
 * https://otpusk.api.domain/tours/services?access_token=ACCESS_TOKEN
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class ServicesDescriptions {

    /**
     * mainService : {"restaurant":"ресторан","a_la_carte":"ресторан A la Carte","cafe":"кафебар","dining":"столовая/зал для завтраков","outdoor_pool":"открытыйбассейн","indoor_pool":"крытый бассейн","conference":"конференц-зал банкетныйзал","business":"бизнес-центр","parking":"автостоянка","rent_car":"прокатавтомобилей","safe":"сейф","wifi":"бесплатныйWi-fi","internet":"интернет-кафе","elevator":"лифт","laundry":"прачечная","cleaners":"химчистка","salon":"парикмахерская / салон красоты","conversion":"обменвалют","atm":"банкомат","doctor":"врач","invalids":"условия дляинвалидов","pets":"размещение с животными","non_smoking":"номера длянекурящих","ski_rental":"прокат лыж","ski_storage":"комната для хранениялыж","transfer":"трансфер в/из аэропорта","late_check":"поздний выезд","dock":"причал для яхт","park":"сад/парк","visa":"оплата платежными картами"}
     * childService : {"childpool":"детский бассейн","playground":"детская площадка","nursery":"детский клуб","childmenu":"детское меню в ресторане","highchairs":"детские стульчики в ресторане","crib":"детская кроватка","nurse":"няня"}
     * sportService : {"sauna":"сауна / баня хамам","jacuzzi":"джакузи","massage":"массаж","spa":"Спа или велнес-центр","billiards":"бильярд","bowling":"боулинг","table_tennis":"настольный теннис","tennis_court":"теннисный корт","squash":"сквош","golf":"гольф","volleyball":"волейбол","basketball":"баскет больная площадка","football":"футбольное поле","equestrian":"центр верховой езды","bikes":"прокат велосипедов","ski_slopes":"рядом подъёмник (до 600 м)","fitness":"тренажерный зал","aerobics":"аэробика","yoga":"занятия йогой","aquapark":"аквапарк или горки","water_sports":"водные развлечения","diving":"дайвинг","surfing":"серфинг","windsurfing":"виндсерфинг","fishing":"рыбная ловля","discotheque":"дискотека","music":"живаямузыка","casino":"казино","animation":"анимация","excursions":"организация экскурсий","weddings":"служба организации торжеств"}
     * beachService : {"own":"собственный пляж","town":"городской пляж","sandy":"песчаный пляж","sandy_pebble":"песчано-галечный пляж","pebble":"галечный пляж","pontoon":"понтон/пирс","chairs":"шезлонги","umbrella":"зонтики","towels":"пляжные полотенца","one_line_beach":"отель на 1-й пляжной линии","two_line_beach":"отель на 2-й пляжной линии","next_beach_line":"отельна 3-й пляжной линии или далее"}
     * roomService : {"shower":"ванна душ","bidet":"биде","hairdryer":"фен","individual":"тапочки и халат","mini-bar":"мини-бар","peter":"сейф","conditioning":"кондиционер","fan":"вентилятор","tv":"кабельное/спутниковое ТВ","plasma":"плазменный телевизор","dvd":"vcd/dvd","phone":"телефон","network":"интернет wi-fi","lan":"кабельный интернет","kitchen":"кухня/кухонный уголок","coffee":"чайник/кофеварка","microwave":"микроволновая печь","fridge":"холодильник","alarm":"услуга «будильник»","terrace":"балкон/терраса","whirlpool":"джакузи","pool":"бассейн"}
     */

    @Id
    @JsonIgnore
    private String id = "_id";

    private Map<String, String> mainService;
    private Map<String, String> childService;
    private Map<String, String> sportService;
    private Map<String, String> beachService;
    private Map<String, String> roomService;
}