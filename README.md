# 🧑🏻‍🚀 NFCtron Mobile Case Study

>👋 Vítejte u zadání pro kandidáty na pozici 📲 **iOS/Android Software Developer** v NFCtron! Vaším úkolem bude
vytvořit jednoduchou mobilní aplikaci na zobrazení a ukládání kryptoměn.

<img src="https://www.nfctron.com/data/blog/hr-mock.1733915983.jpg" alt="Buduj s NFCtron!" />

## 🎯 Úvod

V NFCtron jsme před rokem přepsali naší aplikaci do [Kotlin Multiplatform](https://kotlinlang.org/docs/multiplatform.html).
V Kotlinu udržujeme business logiku aplikace. UI píšeme nativně ve SwiftUI a Jetpack Compose.
I tvým úkolem bude tedy vytvořit jednoduchou mobilní aplikaci pomocí KMP a nativních UI frameworků.

### High-Level popis aplikace

Vytvoříš jednoduchou aplikaci pro iOS/Android. Počítáme s tím, že hned nebudeš schopen napsat aplikaci pro obě platformy, na to ti dáme prostor u nás. Můžeš si tedy vybrat jednu a tu nám poslat.
Dáme ti prostor a design necháme na tobě. Měj na paměti, že každá platforma má svoje UI/UX guidelines a ty chceme dodržovat.
Co se týče shared KMP modulu, tak bychom byli rádi, kdyby byla většina kódu právě tady, sdílená pro obě platformy.

Z různých free to use API jsme vybrali právě [CoinGecko](https://docs.coingecko.com/reference/introduction). Toto API poskytuje dostatečné množství dat a podporuje různá filtrování.

## 🌱 Požadavky na Funkčnost

Co bude cílem a obsahem aplikace? Aplikace bude zobrazovat trending kryptoměny. Uživatel bude moci vybrané kryptoměny označit jako oblíbené. Oblíbené kryptoměny uvidí v separátním seznamu, ze kterého je může i odstranit.
Co když tvoje oblíbená kryptoměna nebude v trending seznamu? V aplikaci si ji budeš moct vyhledat a přidat do seznamu oblíbených.

### Požadavky
- [ ] Seznam trending kryptoměn. [[Trending Search List](https://docs.coingecko.com/reference/trending-search)]
- [ ] Seznam oblíbených kryptoměn. [[Coins List with Market Data](https://docs.coingecko.com/reference/coins-markets)]
  - [ ] V listingu jsou vidět informace o růstu za poslední časový úsek, ilustrace grafu, jméno a aktuální cena.
- [ ] Označení oblíbených kryptoměn.
- [ ] Vyhledávání v kryptoměnách. [[Search Queries](https://docs.coingecko.com/reference/search-data)]
- [ ] Aplikace persistuje poslední aktuální data pro offline přístup.
- [ ] Aplikace dodržuje iOS/Android konvence a guidelines

## 🌟 Bonusové Funkce

- [ ] Lokalizace aplikace.
- [ ] Graf vývoje ceny za různá časová období.
- [ ] Aplikace pro druhou platformu. 🔥
- [ ] Unit a UI testy.

_A dalším vychytávkám se meze nekladou! Ukažte, co umíte! 💫_

## 🔨 Doporučené technologie a nástroje
- SwiftUI/Jetpack Compose
- [Kotlin Multiplatform](https://kotlinlang.org/docs/multiplatform.html)
- MVVM architektura
- [Koin](https://insert-koin.io)
- [Ktor](https://ktor.io)
- [SQLDelight](https://github.com/cashapp/sqldelight)
- [KDoctor](https://github.com/Kotlin/kdoctor)
- [SwiftLint](https://github.com/realm/SwiftLint) + [ktlint](https://github.com/pinterest/ktlint)

## ☝🏻 Dobré vědět
- Využití jiných knihoven není zakázáno.
- Dbejte na kvalitu kódu, jeho čitelnost a strukturu.
- Dávejte si pozor na porušení architektury.
- Informace stačí zobrazovat v USD.

_Podporujeme a oceníme růst, na ten je v NFCtron prostoru dost! 📈 Naučil ses něco nového, nebo tě něco zaujalo? Určitě napiš do svého _`COMMENTS.md`_ své pocity a cestu vývojem aplikace. 🚀_

## 📋 Kritéria Hodnocení
- Funkčnost a splnění funkčních požadavků.
- Vzhled aplikace a dodržení platform specific guidelines.
- Kvalita, struktura a komentování/dokumentace kódu.
- Práce s Git.

## 🪜 Jak postupovat?

1. Udělejte si fork tohoto repozitáře.
2. Nastavte si své oblíbené vývojové prostředí.
3. Dokončete úkol dle požadavků a zadání výše.
4. Průběžně commitujte a pushujte své změny.
5. Otestujte řádně svou aplikaci.
6. Jakékoliv komentáře, či doplnění informací/dokumentace k vaší práci uvítáme v souboru `COMMENTS.md`.
7. Po dokončení úkolu přiložte do žádosti u našeho inzerátu [iOS/Android Developer Incubation](https://www.nfctron.com/cs/kariera/ios-android-developer-incubation) odkaz na Váš repozitář.


📧 Máte-li jakékoli dotazy nebo potřebujete pomoci, neváhejte se na nás obrátit na emailu [hr@nfctron.com](mailto:hr@nfctron.com).

---

Přejeme vám hodně štěstí a těšíme se na vaše řešení! 🌟

_–– Tým NFCtron_
