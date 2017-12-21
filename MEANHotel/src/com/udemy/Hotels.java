package com.udemy;

public class Hotels {
    private String name;

    public Hotels(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int stars(){
        return 0;
    }
}

class HotelProvidence extends Hotels{
    public HotelProvidence(){
        super("HotelProvidence");
    }

    @Override
    public int stars(){
        return 4;
    }

}

class OmniProvidenceHotel extends Hotels{
    public OmniProvidenceHotel(){
        super("OmniProvidenceHotel");
    }

    @Override
    public int stars(){
        return 1;
    }
}

class RenaissanceProvidenceDowntownHotel extends Hotels{
    public RenaissanceProvidenceDowntownHotel(){
        super("Renaissance Providence Downtown Hotel");
    }

    @Override
    public int stars(){
        return 3;
    }
}

class ProvidenceMariottDowntown extends Hotels{
    public ProvidenceMariottDowntown(){
        super("Providence Mariott Downtown");
    }

    @Override
    public int stars(){
        return 3;
    }
}

class TheDeanHotel extends Hotels{
    public TheDeanHotel(){
        super("The Dean Hotel");
    }

    @Override
    public int stars(){
        return 4;
    }
}

class HiltonProvidence extends Hotels{
    public HiltonProvidence(){
        super("Hilton Providence");
    }

    @Override
    public int stars(){
        return 1;
    }
}

class ProvidenceBiltmore extends Hotels{
    public ProvidenceBiltmore(){
        super("Providence Biltmore");
    }

    @Override
    public int stars(){
        return 3;
    }
}

class HamptonInnSuitesProvidenceDowntown extends Hotels{
    public HamptonInnSuitesProvidenceDowntown(){
        super("Hampton Inn & Suites Providence Downtown");
    }

    @Override
    public int stars(){
        return 2;
    }
}

class HiltonGardenInnProvidence extends Hotels{
    public HiltonGardenInnProvidence(){
        super("Hilton Garden Inn Providence");
    }

    @Override
    public int stars(){
        return 4;
    }
}

class CourtyardProvidenceDowntown extends Hotels{
    public CourtyardProvidenceDowntown(){
        super("Courtyard Providence Downtown");
    }

    @Override
    public int stars(){
        return 3;
    }
}

