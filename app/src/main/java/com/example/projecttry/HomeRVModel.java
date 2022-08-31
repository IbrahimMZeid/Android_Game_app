package com.example.projecttry;

import java.util.ArrayList;

public class HomeRVModel {
    private String title;
    private String subTitle;
    private String homeImageUrl;
    private String url;
    private String content;
    private String state;

    public HomeRVModel() {
    }

    public HomeRVModel(String title, String subTitle, String homeImageUrl, String url, String content, String state) {
        this.title = title;
        this.subTitle = subTitle;
        this.homeImageUrl = homeImageUrl;
        this.url = url;
        this.content = content;
        this.state = state;
    }

    public String getUrl() {
        return url;
    }

    public String getContent() {
        return content;
    }


    public String getTitle() {
        return title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public String getHomeImageUrl() {
        return homeImageUrl;
    }

    public String getState() {
        return state;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public void setHomeImageUrl(String homeImageUrl) {
        this.homeImageUrl = homeImageUrl;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setState(String state) {
        this.state = state;
    }

    public static ArrayList<HomeRVModel> addData(ArrayList<HomeRVModel> homeRVModelArrayList) {

        homeRVModelArrayList.add(new HomeRVModel(
                "Energy: Anti Stress Loops",
                "InfinityGames.io",
                "https://playbestfreegame.com/wp-content/uploads/2020/05/unnamed-11.png",
                "https://play.google.com/store/apps/details?id=com.infinitygames.loopenergy",
                "If your body battery is fading, Energy is the perfect boost to recharge it! Featuring a minimalist style, a transmission circuit, and smart brain-teasers, this bright game will help you to calm your anxiety and get your concentration in line!\n" +
                        "\n" +
                        "\n" +
                        "Energy is reminiscent of the classic Loop by its simplicity and satisfaction provided. You just need to tap the wire to rotate it and manage to connect all the lines. Make sure the transmission includes at least a lamp circle, a wire, and a lightning bolt circle to illuminate the light circuit. The wire loops will shine when everything is connected!\n" +
                        "\n" +
                        "Part of the famous Infinity Loop franchise, this calm, minimalist, and smart game will help you dealing with anxiety and OCD. Instead of closing endless loops, you must tap to connect every wire to the lamp and create a closed light transmission. Once you tap the first line, you will boost your concentration and reduce any symptoms of anxiety or OCD. Try to illuminate the circuit as many times as you can and recharge your soul with positive ideas.\n" +
                        "\n" +
                        "\n" +
                        "In calm brain-teasers like this, you don’t need to be super smart or fast as a lightning bolt to succeed. Creating a functional light circle using every wire, bolt, and lamp is more important than delivering a bright performance. ENERGY environment is satisfying and minimalist, featuring a calm soundtrack and endless light loops. The positive energy provided by this game will recharge your smartphone battery or make your brain shine like a star.\n",
                "com.infinitygames.loopenergy"));
        homeRVModelArrayList.add(new HomeRVModel(
                "Asphalt Nitro",
                "Gameloft SE   Racing",
                "https://i1.wp.com/techlector.com/wp-content/uploads/2018/06/Asphalt-Nitro.jpg?ssl=1",
                "https://play.google.com/store/apps/details?id=com.gameloft.android.ANMP.GloftAGHM",
                "Take control of luxury licensed cars, such as the Ferrari LaFerrari or Lamborghini Veneno, in breathtaking environments that you’ll need to tame with the craziest stunts you can pull off. Fire up your Nitro and be the first to cross the finish line.\n" +
                        "\n" +
                        "Take your amazing speed machines and push them miles beyond their limits.\n" +
                        "Hit the ramps and take the race to new heights. Manoeuvre through the air while pulling off mind-blowing stunts.\n" +
                        "\n" +
                        "Multiple racing and stunts modes\n" +
                        "\n" +
                        "Challenge opponents in 8 different game modes, including Gate Drift, Knockdown, and much more.\n" +
                        "Police Chase mode is back for the first time since the earliest days of the series. Beat your friends in asynchronous races.\n" +
                        "\n" +
                        "Locations all around the world\n" +
                        "\n" +
                        "Race across some of the most gorgeous locations on Earth, each recreated with stunning graphics. From Brazil to China, you’ve got a whole world to explore. Discover loads of hidden shortcuts to help you completely dust the competition.",
                "com.gameloft.android.ANMP.GloftAGHM"
        ));
        homeRVModelArrayList.add(new HomeRVModel(
                "Asphalt 8 - Car Racing Game",
                "Gameloft SE   Racing",
                "https://getwallpapers.com/wallpaper/full/3/9/3/127470.jpg",
                "https://play.google.com/store/apps/details?id=com.gameloft.android.ANMP.GloftA8HM",
                "Part of Gameloft’s Asphalt franchise, Asphalt 8 has 300+ licensed cars and motorbikes action-packed races, 75+ tracks, and both online and offline mode. This arcade car racing title offers single and multiplayer racing modes.\n" +
                        "\n" +
                        "Jump into the car and get engaged in this racing experience. Discover scenarios and landscapes, from the Nevada Desert to Tokyo streets. Compete with other racers, take part in different challenges and limited-time events. Get your car ready and drift on the asphalt.\n" +
                        "\n" +
                        "Licensed luxury cars and motorcycles\n" +
                        "\n" +
                        "In Asphalt 8, you can have a fast-racing experience with over 300 high-performing cars and bikes ready to drive, drift and put to the test on the asphalt. Luxury models from top licensed car manufacturers, like Lamborghini, Bugatti, Porsche and many more, including a wide selection of racing motorbikes. Stand out from other racers, customize and design race cars and motorcycles. Collect high-end vehicles, Special Edition cars and drift while exploring different worlds and scenarios.\n" +
                        "\n" +
                        "Customize Racer Avatars\n" +
                        "\n" +
                        "Create your own customizable Racer Avatar! Mix-and-match clothes & accessories, choose the one which fits your car and let your unique racing style shine!\n" +
                        "\n" +
                        "Get Airborne with Asphalt 8\n" +
                        "Hit the ramps and take the race beyond the limits of physics as you jump out of gravity and into the sky with your car or bike. Perform barrel rolls and wild 360° jumps competing against other racers or in single-player mode. Maneuver through the air while pulling off stunts in your car or motorcycle to maximize your speed.\n" +
                        "Control customization where you can rearrange your on-screen icons and controls. You decide which way of playing the game suits you to win every race!\n" +
                        "\n" +
                        "Endless stream of content for fast racers\n" +
                        "Experience the full Asphalt 8 game, with extra content being updated frequently. Upgrade your cars and increase your racing performance!\n" +
                        "Play different seasons, live events & don’t forget to check lots of other modes for a fresh twist on racing. Win top prizes in the Limited-Time Cups, including early access to some of the latest cars or motorbikes in the game.\n" +
                        "\n" +
                        "Multiplayer and single racing experience\n" +
                        "Choose your car and gear up for simultaneous multiplayer action in World Series. Race against other players to score points and unlock prizes in limited-time Racing Events. Defeat your opponents, hold your positions & enjoy your pulse-pounding race!",
                "com.gameloft.android.ANMP.GloftA8HM"
        ));
        homeRVModelArrayList.add(new HomeRVModel(
                "Asphalt 9: Legends",
                "Gameloft SE  Racing",
                "https://mrapks.com/wp-content/uploads/2019/12/ASPHALT-9-LEGENDS-0.jpg",
                "https://play.google.com/store/apps/details?id=com.gameloft.android.ANMP.GloftA9HM",
                "In Asphalt 9: Legends, take the wheel of real cars from high-end renowned legendary car manufacturers, such as Ferrari, Porsche, Lamborghini, and W Motors, among many other international brands. Drive, boost and perform stunts across dynamic real-life locations in single or multiplayer play. Racing adrenaline, brought to you by the creators of Asphalt 8: Airborne.\n" +
                        "\n" +
                        "Customize high-end hypercars\n" +
                        "\n" +
                        "There are over 150 of the world’s A-brand high-speed motor machines to collect. Each vehicle has been selected among world renowned car brands and manufacturers and has customizable aesthetics. Pick your car, customize its body paint, the rims, and wheels or apply different-looking body parts to race with around the world.\n" +
                        "\n" +
                        "Auto & manual racing controls\n" +
                        "\n" +
                        "Level up your skills and race through the streets like a pro with precise manual controls. If you prefer to cruise, TouchDrive™ is a driving control system that streamlines car steering to let you focus on decision and timing. This feature is perfect to let you focus on the environment, the soundtrack and the sound effects.\n" +
                        "\n" +
                        "Events and Career Mode\n" +
                        "\n" +
                        "Embark on a real street racing journey in Career Mode, with over 60 seasons and 900 events. There are always rewarding new challenges to experience in the Events section of Asphalt 9.\n" +
                        "Play the limited-time events or take part in story-driven scenarios to compete among the racers in Asphalt.\n" +
                        "\n" +
                        "Racing sensations\n" +
                        "Experience the pure arcade gameplay of Asphalt 9, combined with realistic racing sensations. A feeling of immersion is guaranteed thanks to our reflection and particle effects, HDR rendering, realistic sound effects, and a soundtrack from renowned musical artists.\n" +
                        "\n" +
                        "Multiplayer mode & racing club\n" +
                        "\n" +
                        "The online multiplayer mode will take your car through real street racing action.\n" +
                        "Race against up to 7 rival players from all over the world in intense racing play. Drive, drift and perform stunts to earn extra points for your Club.\n" +
                        "Create your own online community of racer friends with the Club feature. Play together, race in different locations and unlock rewards as you drive up the ranks of the multiplayer Club leaderboard.",
                "com.gameloft.android.ANMP.GloftA9HM"
        ));
        homeRVModelArrayList.add(new HomeRVModel(
                "N.O.V.A. Legacy",
                "Gameloft SE   Action",
                "https://www.cybermap.co.id/wp-content/uploads/2020/06/Game-N.O.V.A-Legacy-1536x655.jpg",
                "https://play.google.com/store/apps/details?id=com.gameloft.android.ANMP.GloftNOHM",
                "Kal Wardin, our hero, is a veteran N.O.V.A. marine, summoned to don his Mobile Armored Suit and strike against the enemies of the Colonial Administration forces.\n" +
                        "\n" +
                        "Helped by Yelena, his personal AI Agent, Kal must protect humanity's destiny by engaging in combat against alien invaders while uncovering the mystery behind their sudden assault.\n" +
                        "\n" +
                        "- Deathmatch: Be the last shooter standing on an online multiplayer battlefield for 8 combatants. Try not to get caught in the crossfire.\n" +
                        "\n" +
                        "- Team Deathmatch: Make every bullet count in a 4v4 multiplayer strike.\n" +
                        "\n" +
                        "- Customize your marine with a variety of special 3D models and skins.\n" +
                        "\n" +
                        "- Top the online Leaderboards and climb the leagues to achieve your destiny.\n" +
                        "\n" +
                        "- Watch 3rd-person \"\"Death Cam\"\" replays of anyone struck down by a sniper, caught in the crossfire or blown up on the battlefield.\n" +
                        "\n" +
                        "- Upgrade your Suit Cores to add different bonuses that can boost anything from the force of your bullets to your sniper rifle accuracy.\n" +
                        "\n" +
                        "- Matchmaking: Set passwords for private multiplayer matches or use the advanced online matchmaking system.\n" +
                        "\n" +
                        "- An immersive offline and online shooter experience based on a renowned Gameloft FPS series in the same vein as Modern Combat.\n" +
                        "\n" +
                        "- Craft and upgrade sci-fi guns and modern weaponry by collecting cards, from sniper rifles with long-range bullets to plasma guns with devastating force. Having the right gear is critical.\n" +
                        "\n" +
                        "- Enjoy the original N.O.V.A. shooter experience with enhanced 3D graphics and gameplay.\n" +
                        "\n" +
                        "- Play the single-player campaign offline to protect Earth anytime, anywhere.\n" +
                        "\n" +
                        "- Story Mode: Delve into the story offline and fight to uncover the truth about these alien invaders in 19 action-packed FPS levels.\n" +
                        "\n" +
                        "- Shadow Missions: Assault the alien Special Ops Force on challenging limited-time battlefields.\n" +
                        "\n" +
                        "- Special Ops: Launch a critical strike on unique alien formations.",
                "com.gameloft.android.ANMP.GloftNOHM"
        ));
        homeRVModelArrayList.add(new HomeRVModel(
                "Shadow Fight 2",
                "NEKKI    Action",
                "https://posterspy.com/wp-content/uploads/2020/01/3FADD570-8C68-48BB-91DD-DA917949CB63-1500x2120.jpeg",
                "https://play.google.com/store/apps/details?id=com.nekki.shadowfight",
                "The sequel to the famous Facebook smash hit with 40 million users\n" +
                        "\n" +
                        "Shadow Fight 2 is a nail-biting mix of RPG and classical Fighting. This game lets you equip your character with countless lethal weapons and rare armor sets, and features dozens of lifelike-animated Martial Arts techniques! Crush your enemies, humiliate demon bosses, and be the one to close the Gate of Shadows. Do you have what it takes to kick, punch, jump, and slash your way to victory? There’s only one way to find out.\n" +
                        "\n" +
                        "- Plunge into epic combat sequences, rendered in astonishingly lifelike detail by an\n" +
                        "all-new animation system.\n" +
                        "\n" +
                        "- Devastate your enemies with delightfully intuitive controls, thanks to an all-new\n" +
                        "fighting interface designed especially for touchscreens.\n" +
                        "\n" +
                        "- Enter the \"Underworld\" and fight with friends against fearsome bosses!\n" +
                        "\n" +
                        "- Journey through six different worlds full of menacing demons in this action-\n" +
                        "packed, adrenaline-fueled combat RPG with an immersive, intriguing storyline.\n" +
                        "\n" +
                        "- Customize your fighter with epic swords, nunchacku, armor suits, magical powers,\n" +
                        "and more.\n" +
                        "\n" +
                        "Shadow Fight 2. May the battle begin!",
                "com.nekki.shadowfight"
        ));
        homeRVModelArrayList.add(new HomeRVModel(
                "Shadow Fight 3 - RPG fighting",
                "NEKKI      Role Playing",
                "https://static.wikia.nocookie.net/shadowfight/images/c/ca/Screenshot_2017-05-19-19-17-36-661.jpeg/revision/latest/scale-to-width-down/1000?cb=20170522211122",
                "https://play.google.com/store/apps/details?id=com.nekki.shadowfight3",
                "Legend has it that a hero will come to end the fight for shadow energy. He will have to learn three fighting styles, collect the best weapons and challenge the strongest warriors.\n" +
                        "\n" +
                        "The world is on the edge of an epic war. The mighty force unleashed by the Gates of Shadows many years ago has turned into a weapon, and now three war clans are fighting to decide the future of this force.\n" +
                        "\n" +
                        "The Legion warriors want to destroy the dangerous energy. The people of the Dynasty want to use it for their own benefit. While the mysterious ninjas of the Heralds clan explore the darkest secrets of the shadow power.\n" +
                        "\n" +
                        "Three clans, three world views, and three fighting styles. Which side will you join? Fight back with rage and courage if you want to win!\n" +
                        "\n" +
                        "Shadow Fight 3 is a cool fighting game that gives you a great chance to show your skills to the world of players. Become a hero and save the universe from fall.\n" +
                        "\n" +
                        "It is an online RPG fighting game that continues the story of the Shadow Fight universe with new characters in 3D. Get ready for action, cool brawls with powerful fighters, and an exciting adventure around the world, where mystical forces reign.\n" +
                        "\n" +
                        "CREATE AN EPIC HERO\n" +
                        "Ready for a crazy fighting game? Black ninja, honorable knight, or skilled samurai? Only you can choose who your hero will be. Win unique skins in battles and customize your equipment colors to create a unique look.\n" +
                        "\n" +
                        "WIN HERO BATTLES\n" +
                        "Explore the fighting styles of each of the 3 clans in this battling game. Create your personal combat style. Your hero can fight like a cunning ninja or a mighty knight. Harness shadow energy to deliver powerful and impressive blows that can change the course of the battle.\n" +
                        "\n" +
                        "COMPLETE THE STORY\n" +
                        "Warriors around the world await the appearance of a hero who will fight for justice and end the struggle for the power of the shadows. Influence the storyline by choosing your clan. Defeat powerful bosses to challenge your nemesis, and then explore other worlds and travel back in time to learn new details of the story.",
                "com.nekki.shadowfight3"
        ));
        homeRVModelArrayList.add(new HomeRVModel(
                "Mini Militia - Doodle Army 2",
                "Miniclip.com    Action",
                "https://www.thegreatapps.com/application/blog-images/doodle-army-2-mini-militia.jpg",
                "https://play.google.com/store/apps/details?id=com.appsomniacs.da2",
                "Mini Militia - Doodle Army 2 is all about intense multiplayer combat!\n" +
                        "Battle with up to 6 players online in this 2D fun cartoon themed cross between Soldat and Halo, inspired on the original stickman shooter Doodle Army.\n" +
                        "\n" +
                        "\n" +
                        "Key features:\n" +
                        ".Online multiplayer with up to 6 players\n" +
                        ".Intuitive dual stick shooting controls with jetpack flight\n" +
                        ".Over 20 maps to explore\n" +
                        ".Wide range of modern and futuristic weapon types\n" +
                        ".Offline Survival mode",
                "com.appsomniacs.da2"
        ));
        homeRVModelArrayList.add(new HomeRVModel(
                "Hunter Assassin",
                "Ruby Game Studio \t\tAction",
                "https://is1-ssl.mzstatic.com/image/thumb/Purple123/v4/ec/54/be/ec54be8a-86c8-156b-c706-6f816e92d31f/source/1000x1000bb.jpg",
                "https://play.google.com/store/apps/details?id=com.rubygames.assassin",
                "Control the assassin and hunt down your targets one by one. Use your surroundings and shadows to stay hidden from flashlights.\n" +
                        "\n" +
                        "Targets with automatic machine guns can be lurking around each corner. Attack them swiftly and escape without being spotted.\n" +
                        "\n" +
                        "Each eliminated target drops valuable gems. Use gems to unlock faster assassins.\n" +
                        "\n" +
                        "Can you unlock the fastest assassin?\n" +
                        "\n" +
                        "\n" +
                        "Subscription Terms\n" +
                        "\n" +
                        "VIP Membership offers a weekly subscription, you will have a 3-days FREE trial period, after this period you will be charged $7.99. After buying the subscription, you will unlock the following features: Ninja Assassin character, all ads removing, 5000 gems and permanent +100% level gem earning. This is an Auto-renewable subscription. The subscription is renewed unless you turn it off 24 hours before the period ends. Your account will be charged for renewal as well. Payment will be charged to iTunes Account at confirmation of purchase. The account will be charged for renewal within 24-hours prior to the end of the current period, and identify the cost of the renewal. Subscriptions may be managed by the user and auto-renewal may be turned off by going to the user's Account Settings after purchase. Any unused portion of a free trial period, if offered, will be forfeited when the user purchases a subscription to that publication, where applicable.\n",
                "com.rubygames.assassin"
        ));
        homeRVModelArrayList.add(new HomeRVModel(
                "Hunter Assassin 2",
                "Ruby Game Studio \t\tAction",
                "https://lmhmod.com/wp-content/uploads/2021/09/Hunter-Assassin-2-Mod-Icon.jpg",
                "https://play.google.com/store/apps/details?id=com.rubygames.hunterassassin2",
                "The highly awaited, action-packed sequel to the worlds fifth most downloaded game of 2020!\n" +
                        "\n" +
                        "You're an assassin, trained to use shadows and your surroundings to defeat your enemies. Each eliminated target drops valuable items. Use them to unlock and upgrade new weapons and heroes.\n" +
                        "\n" +
                        "Make strategic decisions on how to avoid being cornered by your enemies, and move swiftly to evade their flashlights.\n" +
                        "\n" +
                        "But can you defeat bosses?",
                "com.rubygames.hunterassassin2"
        ));
        homeRVModelArrayList.add(new HomeRVModel(
                "Zombie Catchers",
                "Deca Games \t\tAction",
                "https://image.winudf.com/v2/image1/ZmkudHdvbWVuYW5kYWRvZy56b21iaWVjYXRjaGVyc19zY3JlZW5fYXJfMF8xNTU1NTY5Mjg0XzA0MQ/screen-0.jpg?fakeurl=1&type=.jpg",
                "https://play.google.com/store/apps/details?id=fi.twomenandadog.zombiecatchers",
                "Catching zombies has never been so much fun!\n" +
                        "\n" +
                        "Zombie Catchers is a casual action adventure game in a futuristic world riddled by a zombie invasion! Planet Earth is infested with the undead. But we’re in luck! A.J. and Bud, two intergalactic businessmen, have decided to build a business empire! They plan to hunt all the zombies and make Earth safe once more - while also making a handsome profit selling Zombie Juice.\n" +
                        "\n" +
                        "Walk through the undead wasteland where not even plants can survive, sipping on delicious Zombie shakes between one hunt and the next.\n" +
                        "\n" +
                        "So what are you waiting for? Don't idle around. Choose your weapons and traps & upgrade your character to hunt and capture juicy zombies, take them to your secret underground lab, and... profit!\n" +
                        "\n" +
                        "FEATURES\n" +
                        "- Hunt down zombies with your trusty harpoon gun and sneaky traps!\n" +
                        "- Unlock exciting new hunting gadgets such as nets, weapons, guns, traps, and jetpacks to help you on your quest to catch zombies!\n" +
                        "- Create tasty juices, candies, and awesome snacks from your zombies and sell them to hungry customers in your drive-through cafe!\n" +
                        "- Build a food business empire by developing delicious new recipes and upgrading your production lines to deliver maximum profit!\n" +
                        "- Discover new territories on the map and find unique zombies to collect and squeeze into lucrative food products!\n" +
                        "- Dispatch your army of drones around the world to find awesome zombies to catch!\n" +
                        "- Lure out special boss zombies and capture them with your harpoon from your flying ship!\n" +
                        "- Develop your skill and do perfect catches to climb the hunting ranks to get more plutonium and exclusive costumes for your character!\n" +
                        "- Manage and grow your very own underground lab!\n" +
                        "- Complete fun daily challenges to get awesome rewards!\n" +
                        "- Play offline - no internet connection necessary!",
                "fi.twomenandadog.zombiecatchers"
        ));
//        homeRVModelArrayList.add(new HomeRVModel(
//                "",
//                "",
//                "",
//                "",
//                "",
//                ""
//        ));

        homeRVModelArrayList.add(new HomeRVModel(
                "Real Chess",
                "Alienforce",
                "https://scontent.fcai20-3.fna.fbcdn.net/v/t31.18172-8/13244033_1585597251770765_5322498628781770272_o.jpg?stp=dst-jpg_s960x960&_nc_cat=104&ccb=1-6&_nc_sid=8631f5&_nc_ohc=kQZWh_iLqbUAX966Uog&_nc_ht=scontent.fcai20-3.fna&oh=00_AT9ovFXFFfW2_X3Zlj8e8dHHYZhCzQwXr09-JRiPuRzqLQ&oe=62A98033",
                "https://play.google.com/store/apps/details?id=com.Alienforcegames.ChessFusionFree",
                "Chess app with gorgeous graphics Dedicated for all chess lovers!\n" +
                        "\n" +
                        "This app brings classic chess game into new dimension. With advanced 3D graphics you can feel all beauty of interacting with virtual chess set. Choose to play with AI or with real opponents. \n" +
                        "\n" +
                        "Game Features:\n" +
                        "\n" +
                        "* Advanced 3D graphics;\n" +
                        "* Online gameplay. More than 1 million registered users worldwide.\n" +
                        "* Matchmaking feature;\n" +
                        "* Chat with opponents while playing online;\n" +
                        "* AI with 2400 levels of difficulty;\n" +
                        "* Hints for beginners - highlighting of possible moves;\n" +
                        "* Different themes of chess set;\n" +
                        "* 3D and 2D board variants; \n" +
                        "* Both landscape and portrait screen mode",
                "com.Alienforcegames.ChessFusionFree"));
        homeRVModelArrayList.add(new HomeRVModel(
                "Pocket Tanks",
                "BlitWise Productions, LLC",
                "https://1.bp.blogspot.com/-pEYgIQN_h0o/VSfzL7z6DFI/AAAAAAAADWE/tse1QDQjDWA/s1600/1.png",
                "https://play.google.com/store/apps/details?id=com.blitwise.ptankshd",
                "\"The Ultimate One-on-One Artillery Game\" – Now with cross-platform ONLINE Play!\n" +
                        "\n" +
                        "Pocket Tanks is the fast-paced artillery game that is simple to learn, and fun to master. The perfect quick game for friends and family, you'll find yourself hooked for hours of play! Bury your opponent in a mound of dirt, or assail him with a barrage of bullets. Visit the Weapon Shop before battle to arm yourself for the struggle, or try the Target Practice mode to learn all the weapons and the best tactics to win.",
                "com.blitwise.ptankshd"));
        homeRVModelArrayList.add(new HomeRVModel(
                "Earn To Die 2",
                "Not Doppler",
                "https://komp1k.ru/wp-content/uploads/2018/04/Earn-to-Die-2-%D0%BD%D0%B0-%D0%BA%D0%BE%D0%BC%D0%BF%D1%8C%D1%8E%D1%82%D0%B5%D1%80-1024x585.jpg",
                "https://play.google.com/store/apps/details?id=com.notdoppler.earntodie2",
                "Drive your car through a zombie apocalypse in this epic sequel to Earn to Die!\n" +
                        "\n" +
                        "Drive your car through a zombie apocalypse in this massive follow-up to the chart-topping hit Earn to Die!\n" +
                        "\n" +
                        "An evacuation ship is waiting on the other side of the country. The only thing that stands in your way: city after city overrun by zombies . With only a run-down car and a small amount of cash you face a familiar situation... to drive through hordes of zombies in order to survive!\n" +
                        "\n" +
                        "BRAND NEW STORY MODE\n" +
                        "Earn to Die 2 introduces a massive new Story Mode, five times longer than its predecessor. The game departs its familiar desert setting and delves into the depths of cities infested by zombies. \n" +
                        "\n" +
                        "MULTI-TIERED LEVELS:\n" +
                        "Levels are now multi-tiered! Drive across decayed highway overpasses, via underground tunnels, or smash through epic zombie filled factories. Whichever path you choose to take, you won't be able to escape the zombie hordes - your only choice is to smash through them!",
                "com.notdoppler.earntodie2"));
        homeRVModelArrayList.add(new HomeRVModel(
                "Walk Master",
                "Two Men and a Dog",
                "https://img.tapimg.com/market/images/6217cca1d293d0ff5a32e04b90e95a05.png?imageView2/2/h/1080/w/9999/q/80/format/jpg/interlace/1/ignore-error/1",
                "https://play.google.com/store/apps/details?id=fi.twomenandadog.walkmaster",
                "Show your skills and become the Walk Master!\n" +
                        "\n" +
                        "Test your skills in fun and challenging arcade walking action simulator - for FREE!\n" +
                        "\n" +
                        "Take a walk on the wild side! Trot through the forest and farms with skill, precision and timing to become the Walk Master! Unlock unique challenge levels and crazy creatures!\n" +
                        "\n" +
                        "Features: \n" +
                        "- Master the challenging levels\n" +
                        "- More new levels regularly\n" +
                        "- Collect 31 unique characters \n" +
                        "- Precision controls - easy to learn, hard to master!",
                "fi.twomenandadog.walkmaster"));

        homeRVModelArrayList.add(new HomeRVModel(
                "CarX HighWay Racing",
                "CarXTechnologies, LLC",
                "https://i.ytimg.com/vi/MLJoaKcq0VM/maxresdefault.jpg",
                "https://play.google.com/store/apps/details?id=com.CarXTech.highWay",
                "Become a racing legend on busy highways\n" +
                        "\n" +
                        "#1 racing on a traffic-packed highway!\n" +
                        "\n" +
                        "A mix of lifelike physics which has been the center point of CarX Drift Racing 2, eye-catching graphics and extreme driving on traffic-packed roads is what CarX Highway Racing has to offer.\n" +
                        "\n" +
                        "CAMPAIGN MODE. Immerse yourself in the world of street racing.\n" +
                        "- Check out Texas deserts, visit Australia, France or Russia. A number of countries are there on your way to success.\n" +
                        "- Divulge activities of secret organizations and destroy Winston’s empire\n" +
                        "- Find out what the Syndicate is after and knock down their plans before it’s too late\n" +
                        "- Make new friends who can help you in your endeavors",
                "com.CarXTech.highWay"));
        homeRVModelArrayList.add(new HomeRVModel(
                "Pro League Soccer",
                "Rasu Games",
                "https://i.ytimg.com/vi/Jt7AHLS18BQ/maxresdefault.jpg",
                "https://play.google.com/store/apps/details?id=com.rasugames.pls",
                "Mobile Football Game\n" +
                        "\n" +
                        "Pro League Soccer\n" +
                        "\n" +
                        "Select and upgrade your club!\n" +
                        "After tough weeks, advance from the lower leagues to the upper leagues. Every season, join the league's national club cup and After a good season, get the chance to appear in the league of stars!\n" +
                        "\n" +
                        "Become the king of the continent with your national team!\n" +
                        "Join the league of nations and combat for the cup. Also, take part in many cups with play-offs and show yourself!\n" +
                        "\n" +
                        "Gameplay:\n" +
                        "Provide  360-degree flexibility of movement with fluent controls and character physics. Feel the reality with directional passes and shots.\n" +
                        "\n" +
                        "Ball Control:\n" +
                        "Throw curvilinear shots with improved ball physics. Provide instant ball control and shots with accurate timings.",
                "com.rasugames.pls"));
        homeRVModelArrayList.add(new HomeRVModel(
                "Ninja Arashi",
                "Black Panther",
                "https://i.ytimg.com/vi/kpKjzqht7HM/maxresdefault.jpg",
                "https://play.google.com/store/apps/details?id=com.blackpanther.ninjaarashi",
                "Ninja Arashi is an intense shadow art style platformer with mixed RPG elements.\n" +
                        "\n" +
                        "Ninja Arashi is an intense platformer with mixed RPG elements. In this game, you play as Arashi, a former legendary ninja who fights his way through the corrupted world to save his kidnapped son from the hand of the shadow devil Orochi. With superior acrobatic and deadly weapons, Arashi is ready to face menacing traps and enemies who have sworn to protect the shadow devil Orochi.\n" +
                        "Ninja Arashi features simple yet addicting gameplay, giving you thrilling moments and an unexpected experience. You can upgrade abilities using gold and diamond collected from enemies and the environment in order to keep tracks with the difficulty of the game. Manuever through traps, lay waste on enemies who try to stop you and rescue your son.",
                "com.blackpanther.ninjaarashi"));
        homeRVModelArrayList.add(new HomeRVModel(
                "Ninja Arashi 2",
                "Black Panther",
                "https://gamemod4u.com/wp-content/uploads/2021/03/Ninja-Arashi-2-Mod-Full-tien-cho-dien-thoai-Android.jpg",
                "https://play.google.com/store/apps/details?id=com.blackpanther.ninjaarashi2",
                "Ninja Arashi 2 continues the legacy of the first ninja game.\n" +
                        "In this episode 2, you play as the raging Arashi, who finally escapes from the frozen prison which was created by Dosu, a cruel evil shadow demon. Arashi continues his pursuit after Dosu to rescue his son and unveil the shadow behind Dosu's plan. However, the journey will be much more challenging this time.\n" +
                        "Ninja Arashi 2 features simple yet addicting gameplay, giving you thrilling moments and unexpected experiences. The RPG elements allow you to upgrade your ninja skills and dwell into the depth of the game mechanic.\n" +
                        "FEATURES:\n" +
                        "- Challenging platformer\n" +
                        "- 4 acts story mode with 80 stages to complete\n" +
                        "- Introducing melee weapon\n" +
                        "- Introducing new mechanics\n" +
                        "- A brand new skill tree system\n" +
                        "- A brand new artifact system\n" +
                        "- Superior character control\n" +
                        "- Beautiful graphics and scenery with shadow silhouette style\n" +
                        "- EPIC NINJA VS BOSS FIGHTS",
                "com.blackpanther.ninjaarashi2"
        ));


        homeRVModelArrayList.add(new HomeRVModel(
                "Cut The Rope",
                "ZeptoLab",
                "https://fyine.com/wp-content/uploads/2020/12/game-teka-teki-terbaik-cuttherope-fyine.jpg.webp",
                "https://play.google.com/store/apps/details?id=com.zeptolab.ctr.ads",
                "Cut the Rope, catch a star, and feed Om Nom candy in this award-winning game!\n" +
                        "\n" +
                        "Follow the adventure of Om Nom in the first part of the legendary \"Cut the Rope\" logic puzzles series. Get it now for free and start playing with millions of players around the world!\n" +
                        "\n" +
                        "Eager to learn more about Om Nom's adventures? Watch \"Om Nom Stories\" cartoons and other amazing videos on our YouTube channel!\n" +
                        "www.zep.tl/youtube\n" +
                        "\n" +
                        "A mysterious package has arrived, and the little monster inside has only one request… CANDY!  Collect gold stars, discover hidden prizes and unlock exciting new levels in this addictively fun, award-winning, physics-based game.",
                "com.zeptolab.ctr.ads"));

        homeRVModelArrayList.add(new HomeRVModel(
                "Cut the Rope 2",
                "ZeptoLab \t\t Puzzle",
                "https://image.winudf.com/v2/image1/Y29tLnplcHRvbGFiLmN0cjIuZjJwLmdvb2dsZV9zY3JlZW5fNl8xNTU1MTY1MzgwXzA5NQ/screen-6.jpg?fakeurl=1&type=.jpg",
                "https://play.google.com/store/apps/details?id=com.zeptolab.ctr2.f2p.google",
                "Second part of the legendary Cut the Rope logic puzzles series. Get it now for free!\n" +
                        "\n" +
                        "Cut the Rope 2 is a part of the iconic Cut the Rope franchise by ZeptoLab, which follows the adventures of Om Nom, a cute green creature that adores candies!\n" +
                        "\n" +
                        "Meet Om Nom's friends - the Nommies - and hop on the amazing journey through more than 160 levels that will take you through lush forests, busy cities, junkyards and underground tunnels, all in pursuit of one goal – CANDY!\n" +
                        "\n" +
                        "Familiar to play, yet challenging to master, Cut the Rope 2 brings fresh mind bending challenges and unanticipated obstacles to the casual phenomenon loved by preschool children and adults alike! Keep your brain fit and boost your problem solving skills by mastering the tricky levels based on real-life physics. Tired of mind game? Just sit back and enjoy the cheerful and relaxing game atmosphere of one of the most beautiful free educational apps for kids. If you like Cut the Rope, you’ll love Cut the Rope 2.\n" +
                        "\n" +
                        "ALL NEW LOCATIONS TO EXPLORE! Experience 168 entirely new levels of rope cutting, mind boggling action.\n" +
                        "\n" +
                        "ALL NEW CHARACTERS TO MEET! Find 7 new characters, the Nommies, to help you solve puzzles.\n" +
                        "\n" +
                        "ALL NEW HATS TO BRAG ABOUT! Customize Om Nom, choose your favorite candy and select your finger traces.\n" +
                        "\n" +
                        "ALL NEW ADVENTURES FOR OM NOM! Experience completely new graphics, sound and gameplay elements, including the ability to move Om Nom.\n" +
                        "\n" +
                        "MEET OM NOM’S NEW FRIENDS, THE NOMMIES!\n" +
                        "\n" +
                        "• Roto can carry Om Nom to the best candy catching locations. Nom noms, yummy!\n" +
                        "• Lick can make small bridges with his tongue to help Om Nom reach his goal\n" +
                        "• Blue can lift Om Nom to new levels of candy hunting fun\n" +
                        "• Toss can throw objects up in the air. Use her to boost Om Nom, candies and you problem solving skills! • Boo can scare Om Nom to jump to new heights\n" +
                        "• Snailbrow bravely rolls on walls, ceilings and pushes candies around, like a boss\n" +
                        "• Ginger can burn away obstacles between Om Nom and the candy\n" +
                        "\n" +
                        "Tired of mind work and cutting ropes? Relax and enjoy Om Nom's exciting adventures with the 'Om Nom Stories' cartoon series without leaving the app!\n" +
                        "\n" +
                        "And don't forget to subscribe to our YouTube channel for more candy crunching videos with your favorite sweet tooth! http://bit.ly/1TO38ex\n" +
                        "\n" +
                        "Already a fan?",
                "com.zeptolab.ctr2.f2p.google"
        ));

        homeRVModelArrayList.add(new HomeRVModel(
                "Tetris",
                "PLAYSTUDIOS INC",
                "https://cdn.cultofmac.com/wp-content/uploads/2020/01/5185E81D-F3DC-4A3E-927F-32412A16923F.jpeg",
                "https://play.google.com/store/apps/details?id=com.n3twork.tetris",
                "Play the timeless block puzzle game together with everyone, anywhere!\n" +
                        "\n" +
                        "Welcome to TETRIS®, the official mobile app for the world’s favorite puzzle game. Battle to be the last one standing in 100-player TETRIS ROYALE mode, play a quick round to beat your own score, or play infinite rounds to master your skills in the TETRIS Single Player Modes. TETRIS forever!\n" +
                        "\n" +
                        "Enjoy the ultimate block puzzle game with these amazing features:\n" +
                        "\n" +
                        "\uD83D\uDC51 TETRIS ROYALE \uD83D\uDC51\n" +
                        "• Battle against 99 other players in last-one-standing matches.\n" +
                        "• Clear lines and use boosters to send attacks or defend your Matrix from Garbage.\n" +
                        "• Earn Tournament Points to climb limited-time leaderboards and win rewards.",
                "com.n3twork.tetris"));

        return homeRVModelArrayList;
    }
}
