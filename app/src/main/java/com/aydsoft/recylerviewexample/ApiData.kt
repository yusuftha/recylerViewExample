package com.aydsoft.recylerviewexample

object ApiData {
    var productList = mutableListOf<Product>()
    init {
        load()
    }

    private fun load() {
        val product1 = Product(
            name = "Mantı Nasıl Yapılır?",
            desc = "Tarif için tıklayınız. ",
            recipe = "1- Derince bir karıştırma kabına 3,5 su bardağı un , 1 çay kaşığı tuz ekleyelim.\n \n" +
                    "2- Karıştırarak unun ortasına bir çukur açalım.\n \n" +
                    "3- Ortasına 1 adet yumurtayı ekleyelim ve karıştırmaya devam edelim.\n \n" +
                    "4- Karıştırırken 1 su bardağı ılık suyu yavaş yavaş ekleyelim.\n \n" +
                    "5- Hamurun ne çok sert ne de yumuşak olacak bir kıvama gelene kadar yoğuralım.\n \n" +
                    "6- Hazır olan hamurun üzerini streç film ile kapatalım ve dinlendirelim.\n \n" +
                    "7- Hamur dinlenirken uygun bir karıştırma kabına 250 gram az yağlı kıyma ekleyelim.\n \n" +
                    "8- Ardından 1 adet orta boy soğan, yarım çay kaşığı karabiber, 1 çay kaşığı tuz, yarım çay kaşığı pul biber ekleyelim ve güzelce karıştıralım.\n \n" +
                    "9- Un serptiğimiz tezgaha hamuru alalım, yoğurarak hamuru toparlayalım. Hamuru 3 eşit parçaya ayıralım.\n\n" +
                    "10- Ayırdığımız hamurları bezeler haline getirelim. Un serptiğimiz tezgahta hazırladığımız bezeleri teker teker yufkadan kalın olacak şekilde oklava ile açalım.\n\n" +
                    "11- Açtığımız hamuru bir bıçak ile küçük kareler halinde keselim. Kesiğimiz karelerin ortasına hazırladığımız kıyma karışımında ufak parçalar halinde koyalım.\n\n" +
                    "12- Hamurun 4 köşesini ortada birleştirerek mantı şeklini verelim. Altını unladığımız bir tepsiye şekil verdiğimiz mantıları toplayalım ve tepsiyi dondurucuya alarak donduralım.\n\n" +
                    "13- Dondurucudan aldığımız mantıları koroplast çift kilitli poşetlere koyarak daha sonra pişirmek üzere buzlukta saklayabilirsiniz. Uygun bir tencerede suyu kaynatalım.\n\n" + "Buzluktan aldığımız mantıları da suya ekleyerek 15-20 dakika kadar pişirelim. Uygun bir sos tavasına 2 yemek kaşığı tereyağı ekleyelim, ardından 2 yemek kaşığı salçayı da ekleyip güzelce karıştıralım.\n\n" +
                    "14- Hazırladığımız salçalı sosu pişen mantıların içine ekleyelim ve karıştırarak pişirmeye devam edelim. Pişen mantıları derince bir tabağa alalım üzerine sarımsaklı veya normal yoğurt dökelim. Mantı tarifimiz hazır. Pul biber, nane ve sumak ekleyerek servis edebilirisiniz.\n\n",
            image = R.drawable.manti
        )
        val product2 = Product(
            name = "Ciger Tava Nasıl Yapılır?",
            desc = "Tarif için tıklayınız",
            recipe = "Sinirleri alınan taze dana karaciğeri keskin bir bıçakla ince ince yaprak şeklinde kıyılıp, yıkanıp tuzlandıktan sonra kıyılan ciğerler una bulanıp bol ve kızgın yağda kızartılır. Tavadan alınan kızarmış ciğerler servise sunulur.",
            image = R.drawable.ciger
        )
        val product3 = Product(
            name = "Ezogelin Çorbası Nasıl Yapılır?",
            desc = "Tarif için tıklayınız",
            recipe = "1- Ezogelin çorbası yapmak için düdüklü tencerede önce rendelemiş olduğumuz soğanı ve ezmiş olduğumuz sarımsağı tereyağında kavuruyoruz. Soğanlar diriliğini kaybetsin yeterli yakmadan orta ateşte kavuralım.\n\n" +
                    "2- Soğanlar kavrulunca naneyi, kırmızı biberi ve salçayı ilave edip. Kavurmaya devam edelim.\n\n" +
                    "3- Bir iki karıştırdıktan sonra yıkadığımız mercimeği, pirinci, bulguru ve tuzunu da ilave ederek karıştıralım.\n\n" +
                    "4- Başka bir tarafta kaynamakta olan 2 litreye yakın suyu üzerine boşaltalım.\n\n" + "Düdüklünün kapağını ve düdüğünü kapattıktan sonra 10 dakika pişiriyoruz. Normal tencerede de yapabilirsiniz ama biraz daha geç pişecektir (yaklaşık 30-40 dakika sürecektir).",
            image = R.drawable.ezogelin
        )
        val product4 = Product(
            name = "Hamsi Tava Nasıl Yapılır?",
            desc = "Tarif için tıklayınız",
            recipe = "1- Balıkların temizledikten sonra (kafasını koparıp, içini boşaltın) iyice yıkayalım  ve suyunu süzelim.\n \n" +
                    "2- Ardından uygun bir bir kaba koyarak tuz serpelim, elimizle karıştıralım.\n \n" +
                    "3- Hamsileri, tabağa koyduğunuz mısır ununa güzelce bulayalım.\n \n" +
                    "4- Tavaya sıvı yağı koyarak fırça yardımı ile her tarafına gelmesini sağlayalım.\n \n" +
                    "5- Balıkları aynı yönde, sıkı bir şekilde dizerek daire oluşturalım ve tavamızı ocağa alarak yüksek ateşte 7-8 dakika pişmeye bırakalım. Balıklarınızı tavanıza göre tek seferde pişirebileceğiniz gibi 3 seferde porsiyonluk olarak da pişirebilirsiniz.\n \n" +
                    "6- Balıkların alt kısmı kızardıktan sonra üzerine düz bir kapak kapatalım ve fazla yağını ayrı bir kaba süzdürelim.\n \n" +
                    "7- Daha sonra balıklarımızın diğer yüzünü de çevirerek süzdürdüğümüz yağı tekrar üzerine gezdirelim ve kızarmaya bırakalım.\n \n" +
                    "8- Balıklarımızın her iki yüzeyi kızardığında servis tabağına alalım. Afiyet olsun..",
            image = R.drawable.hamsi
        )
        val product5 = Product(
            name = "Köfte Nasıl Yapılır?",
            desc = "Tarif için tıklayınız",
            recipe = "1- Pirinç haşlanır ve süzülür.\n \n" +
                    "2- Soğan yemeklik olarak doğranır ve tavaya çok az miktarda sıvı yağ konarak öldürülür.\n\n" +
                    "3- Üzerine kıymanın yarısı ilave edilerek orta derecede kavrulur.\n\n" +
                    "4- Yağı tamamen süzülerek bir yayvan kaba aktarılır.\n\n" +
                    "5- İçine yumurta, pirinç, tuz, biberi ayarlanıp çiğ olarak kalan 250 g kıyma da konulduktan sonra yoğurulur.\n\n" +
                    "6- Önemli olan malzemenin birbiriyle iyice özdeşmesidir. Köfte harcını en az yarım saat kadar dinlendirdikten sonra hazırlanan harçtan irice ve yassı oval şekilli hazırlanan köfteler önce una bulanır.\n\n" +
                    "7- Daha sonra köfteler önce galeta ununa daha sonra bir kase içerisine kırıp çırptığınız yumurtaya batırılır.\n\n" +
                    "8- Tavada iyice kızdırılan sıvı yağda köftelerin her iki yönü kızartılır.\n\n" +
                    "9- Kızaran köfteleri kağıt havlu üzerine alarak fazla yağı alın.\n\n" +
                    "10- Servise hazır. Afiyet olsun…",
            image = R.drawable.kofte
        )
        val product6 = Product(
            name = "Levrek Nasıl Yapılır?",
            desc = "Tarif için tıklayınız",
            recipe = "1- Levrekleri temizletip yıkayalım.\n\n" +
                    "2- Fırın tepsisine yağlı kağıt sererek levrekleri üzerine yerleştirelim.\n\n" +
                    "3- Balıkların içine ve üzerine azar azar zeytinyağı gezdirelim. Tuz ve karabiber serpelim.\n\n" +
                    "4- Soğanları, domatesi ve limonu dilimleyerek balıkların içine yerleştirip fırına sürelim.\n\n" +
                    "5- 160 derecede 45-50 dakika kadar pişirelim.",
            image = R.drawable.levrek
        )
        val product7 = Product(
            name = "Kremalı Makarna Nasıl Yapılır?",
            desc = "Tarif için tıklayınız",
            recipe = "1- Makarna haşlama suyuna 1 yemek kaşığı tuz yerine 1 tatlı kaşığı tuz koyarak haşlayıp, kremalı sosa 1 adet knorr tablet yada çeşni ekleyerek nefis lezzette makarna sosu haline de dönüştürebilirsiniz. \uD83C\uDF5D\uD83C\uDF5D\n\n" +
                    "2- Makarna 10 dakika kadar fazla dağılmadan yumuşayana kadar haşlanır. Süzülmeye bırakılır.\n\n" +
                    "3- Tavaya yağlar konulur. Eriyince krema eklenir, karıştırılır ve tıkırdamaya başlayınca fesleğen eklenip karıştırılır ve altı kapatılır.\n\n" +
                    "4- Süzülmüş makarna tencereye alınır.\n\n" +
                    "5- İçine kremalı sos dökülüp karıştırılır.\n\n" +
                    "6- Kremalı soslu makarnalar 15 dakika dinlendikten sonra kendini çekiyor kıvama geliyor çok daha lezzetli oluyor. Çok çabuk hazır ediliyor ona göre yemeğe yakın şipşak yapabilirsiniz.",
            image = R.drawable.makarna
        )
        val product8 = Product(
            name = "Pilav Nasıl Yapılır?",
            desc = "Tarif için tıklayınız",
            recipe = "1- Pirinci bol su ile yıkayın. Uygun bir kaba alarak üzerini geçecek kadar ılık su ekleyin. Birazda tuz ilave edip karıştırın ve 15-20 dakika bekletin. Daha sonra yıkayarak suyunu süzün. Nişastası gidene kadar yıkıyoruz. Çıkan suyun berrak olması gerekiyor.\n\n" +
                    "2- Tencerede tereyağını eritip suyu süzülmüş pirinci ekleyin ve 4-5 dakika kadar kavurun. Pirinçlerin yeteri kadar kavrulduğunu pirinler tane tane dökülmeye başladığında anlayabilirsiniz.\n\n" +
                    "3- Pirinçler kavrulduktan sonra sıcak su veya sıcak et suyunu ekleyelim. İsterseniz yarım tavuk suyu yarım sıcak su kullanabilirsiniz. Tavuk suyunuz yağlı ise bu şekilde su ile karıştırmanızı tavsiye ederim ancak yağlı değilse tamamı tavuk suyu ile çok daha lezzetli olacaktır.\n\n" +
                    "4- Son olarak tuzu ekleyin.\n\n" +
                    "5- Pilavımızı kapağı kapalı bir şekilde önce yüksek ateşte pişmeye bırakalım.\n\n" +
                    "6- Üzeri göz göz olduğunda yani üzerindeki suyu çekip pilavın üzerinde nokta nokta delikler oluştuğunda kısık ateşe alalım.  Pirinçler yumuşayıp suyu tamamen çekene kadar pişirelim.\n\n" +
                    "7- Pişen pilavımızı ocaktan aldıktan sonra üzerine havlu peçete sererek kapağını tekrar kapatalım.\n\n" +
                    "8- Pilavı 10-15 dk. dinlendirelim. Daha sonra tahta kaşık ile karıştırarak servis yapabilirsiniz.",
            image = R.drawable.pilav
        )
        productList.add(product1)
        productList.add(product2)
        productList.add(product3)
        productList.add(product4)
        productList.add(product5)
        productList.add(product6)
        productList.add(product7)
        productList.add(product8)
    }


}