package com.tencent.mm.plugin.card.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.am;
import com.tencent.mm.protocal.c.an;
import com.tencent.mm.protocal.c.ao;
import com.tencent.mm.protocal.c.xf;
import java.util.Iterator;
import java.util.LinkedList;

public class CardGiftInfo
  implements Parcelable
{
  public static final Parcelable.Creator<CardGiftInfo> CREATOR;
  public String fKT;
  public String hbA;
  public String knI;
  public String knJ;
  public String knK;
  public String knL;
  public String knM;
  public String knN;
  public String knO;
  public String knP;
  public String knQ;
  public String knR;
  public String knS;
  public String knT;
  public String knU;
  public boolean knV;
  public int knW;
  public int knX;
  public int knY;
  public String knZ;
  public String koa;
  public int kob;
  public String koc;
  public String kod;
  public String koe;
  public String kof;
  public String kog;
  public String koh;
  public String koi;
  public String koj;
  public String kok;
  public LinkedList<AcceptedCardItem> kol;
  public LinkedList<AccepterItem> kom;
  public String kon;
  public int koo;
  public String kop;
  public String koq;
  public String toUserName;
  
  static
  {
    GMTrace.i(4902973603840L, 36530);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(4902973603840L, 36530);
  }
  
  public CardGiftInfo()
  {
    GMTrace.i(4902034079744L, 36523);
    this.kol = new LinkedList();
    this.kom = new LinkedList();
    GMTrace.o(4902034079744L, 36523);
  }
  
  protected CardGiftInfo(Parcel paramParcel)
  {
    GMTrace.i(4902168297472L, 36524);
    this.kol = new LinkedList();
    this.kom = new LinkedList();
    this.toUserName = paramParcel.readString();
    this.fKT = paramParcel.readString();
    this.knI = paramParcel.readString();
    this.knJ = paramParcel.readString();
    this.knK = paramParcel.readString();
    this.knL = paramParcel.readString();
    this.knM = paramParcel.readString();
    this.knN = paramParcel.readString();
    this.knO = paramParcel.readString();
    this.knP = paramParcel.readString();
    this.knQ = paramParcel.readString();
    this.knR = paramParcel.readString();
    this.knS = paramParcel.readString();
    this.knT = paramParcel.readString();
    this.knU = paramParcel.readString();
    this.hbA = paramParcel.readString();
    if (paramParcel.readByte() != 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.knV = bool;
      this.knW = paramParcel.readInt();
      this.knX = paramParcel.readInt();
      this.knY = paramParcel.readInt();
      this.knZ = paramParcel.readString();
      this.koa = paramParcel.readString();
      this.kob = paramParcel.readInt();
      this.koc = paramParcel.readString();
      this.kod = paramParcel.readString();
      this.koe = paramParcel.readString();
      this.kof = paramParcel.readString();
      this.kog = paramParcel.readString();
      this.koh = paramParcel.readString();
      this.koi = paramParcel.readString();
      this.koj = paramParcel.readString();
      this.kok = paramParcel.readString();
      paramParcel.readTypedList(this.kol, AcceptedCardItem.CREATOR);
      paramParcel.readTypedList(this.kom, AccepterItem.CREATOR);
      this.kon = paramParcel.readString();
      this.koo = paramParcel.readInt();
      this.kop = paramParcel.readString();
      this.koq = paramParcel.readString();
      GMTrace.o(4902168297472L, 36524);
      return;
    }
  }
  
  public static CardGiftInfo a(am paramam)
  {
    GMTrace.i(4902705168384L, 36528);
    CardGiftInfo localCardGiftInfo = new CardGiftInfo();
    localCardGiftInfo.toUserName = paramam.ttj;
    localCardGiftInfo.fKT = paramam.ttk;
    localCardGiftInfo.knI = paramam.ttl;
    localCardGiftInfo.knJ = paramam.content;
    localCardGiftInfo.knK = paramam.ttm;
    localCardGiftInfo.knL = paramam.ttn;
    localCardGiftInfo.knM = paramam.tto;
    localCardGiftInfo.knN = paramam.ttp;
    localCardGiftInfo.knP = paramam.ttr;
    localCardGiftInfo.knO = paramam.ttq;
    localCardGiftInfo.knQ = paramam.tts;
    localCardGiftInfo.knR = paramam.ttt;
    localCardGiftInfo.knS = paramam.kor;
    localCardGiftInfo.knT = paramam.kos;
    localCardGiftInfo.knU = paramam.ttu;
    localCardGiftInfo.hbA = paramam.hbA;
    localCardGiftInfo.knV = paramam.ttv;
    localCardGiftInfo.knW = paramam.ttw;
    localCardGiftInfo.knX = paramam.ttx;
    localCardGiftInfo.knY = paramam.tty;
    localCardGiftInfo.knZ = paramam.ttz;
    localCardGiftInfo.koa = paramam.ttA;
    localCardGiftInfo.kob = paramam.ttB;
    localCardGiftInfo.koc = paramam.ttC;
    localCardGiftInfo.kod = paramam.ttD;
    localCardGiftInfo.koe = paramam.ttE;
    localCardGiftInfo.kof = paramam.ttF;
    localCardGiftInfo.kog = paramam.ttG;
    localCardGiftInfo.koh = paramam.ttH;
    localCardGiftInfo.koi = paramam.ttI;
    localCardGiftInfo.koj = paramam.knp;
    localCardGiftInfo.kok = paramam.ttJ;
    Iterator localIterator = paramam.kol.iterator();
    Object localObject1;
    LinkedList localLinkedList;
    Object localObject2;
    while (localIterator.hasNext())
    {
      localObject1 = (an)localIterator.next();
      localLinkedList = localCardGiftInfo.kol;
      localObject2 = new AcceptedCardItem();
      ((AcceptedCardItem)localObject2).kos = ((an)localObject1).kos;
      ((AcceptedCardItem)localObject2).kor = ((an)localObject1).kor;
      localLinkedList.add(localObject2);
    }
    localIterator = paramam.kom.iterator();
    while (localIterator.hasNext())
    {
      localObject1 = (ao)localIterator.next();
      localLinkedList = localCardGiftInfo.kom;
      localObject2 = new AccepterItem();
      ((AccepterItem)localObject2).kos = ((ao)localObject1).kos;
      ((AccepterItem)localObject2).kor = ((ao)localObject1).kor;
      ((AccepterItem)localObject2).kou = ((ao)localObject1).kou;
      ((AccepterItem)localObject2).kot = ((ao)localObject1).kot;
      localLinkedList.add(localObject2);
    }
    localCardGiftInfo.kon = paramam.kon;
    localCardGiftInfo.koo = paramam.koo;
    localCardGiftInfo.kop = paramam.kop;
    localCardGiftInfo.koq = paramam.koq;
    GMTrace.o(4902705168384L, 36528);
    return localCardGiftInfo;
  }
  
  public static CardGiftInfo a(xf paramxf)
  {
    GMTrace.i(4902839386112L, 36529);
    CardGiftInfo localCardGiftInfo = new CardGiftInfo();
    localCardGiftInfo.toUserName = paramxf.ttj;
    localCardGiftInfo.fKT = paramxf.ttk;
    localCardGiftInfo.knI = paramxf.ttl;
    localCardGiftInfo.knJ = paramxf.content;
    localCardGiftInfo.knK = paramxf.ttm;
    localCardGiftInfo.knL = paramxf.ttn;
    localCardGiftInfo.knM = paramxf.tto;
    localCardGiftInfo.knN = paramxf.ttp;
    localCardGiftInfo.knP = paramxf.ttr;
    localCardGiftInfo.knO = paramxf.ttq;
    localCardGiftInfo.knQ = paramxf.tts;
    localCardGiftInfo.knR = paramxf.ttt;
    localCardGiftInfo.knS = paramxf.kor;
    localCardGiftInfo.knT = paramxf.kos;
    localCardGiftInfo.knU = paramxf.ttu;
    localCardGiftInfo.hbA = paramxf.hbA;
    localCardGiftInfo.knV = paramxf.ttv;
    localCardGiftInfo.knW = paramxf.ttw;
    localCardGiftInfo.knX = paramxf.ttx;
    localCardGiftInfo.knY = paramxf.tty;
    localCardGiftInfo.knZ = paramxf.ttz;
    localCardGiftInfo.koa = paramxf.ttA;
    localCardGiftInfo.kob = paramxf.ttB;
    localCardGiftInfo.koc = paramxf.ttC;
    localCardGiftInfo.kod = paramxf.ttD;
    localCardGiftInfo.koe = paramxf.ttE;
    localCardGiftInfo.kof = paramxf.ttF;
    localCardGiftInfo.kog = paramxf.ttG;
    localCardGiftInfo.koh = paramxf.ttH;
    localCardGiftInfo.koi = paramxf.ttI;
    localCardGiftInfo.koj = paramxf.knp;
    localCardGiftInfo.kok = paramxf.ttJ;
    GMTrace.o(4902839386112L, 36529);
    return localCardGiftInfo;
  }
  
  public int describeContents()
  {
    GMTrace.i(4902302515200L, 36525);
    GMTrace.o(4902302515200L, 36525);
    return 0;
  }
  
  public String toString()
  {
    GMTrace.i(4902570950656L, 36527);
    String str = "CardGiftInfo{toUserName='" + this.toUserName + '\'' + ", fromUserName='" + this.fKT + '\'' + ", fromUserImgUrl='" + this.knI + '\'' + ", fromUserContent='" + this.knJ + '\'' + ", fromUserContentPicUrl='" + this.knK + '\'' + ", fromUserContentVideoUrl='" + this.knL + '\'' + ", fromUserContentThumbPicUrl='" + this.knM + '\'' + ", picAESKey='" + this.knN + '\'' + ", videoAESKey='" + this.knO + '\'' + ", thumbVideoAESKey='" + this.knP + '\'' + ", cardBackgroundPicUrl='" + this.knQ + '\'' + ", cardLogoLUrl='" + this.knR + '\'' + ", cardTitle='" + this.knS + '\'' + ", cardPrice='" + this.knT + '\'' + ", footerWording='" + this.knU + '\'' + ", color='" + this.hbA + '\'' + ", needJump=" + this.knV + ", picDataLength=" + this.knW + ", videoDataLength=" + this.knX + ", thumbDataLength=" + this.knY + ", descTitle='" + this.knZ + '\'' + ", descIconUrl='" + this.koa + '\'' + ", descLayoutMode=" + this.kob + ", giftingMediaTitle='" + this.koc + '\'' + ", descriptionTitleColor='" + this.kod + '\'' + ", cardTitleColor='" + this.koe + '\'' + ", cardPriceTitleColor='" + this.kof + '\'' + ", userCardId='" + this.kog + '\'' + ", operationTitle='" + this.koh + '\'' + ", operationUrl='" + this.koi + '\'' + ", cardTpId='" + this.koj + '\'' + ", cardCode='" + this.kok + '\'' + ", accepted_card_list_size='" + this.kol.size() + '\'' + ", accepter_list_size='" + this.kom.size() + '\'' + ", accepter_list_title='" + this.kon + '\'' + ", out_of_card='" + this.koo + '\'' + ", operation_wxa_username='" + this.kop + '\'' + ", operation_wxa_path='" + this.koq + '\'' + '}';
    GMTrace.o(4902570950656L, 36527);
    return str;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(4902436732928L, 36526);
    paramParcel.writeString(this.toUserName);
    paramParcel.writeString(this.fKT);
    paramParcel.writeString(this.knI);
    paramParcel.writeString(this.knJ);
    paramParcel.writeString(this.knK);
    paramParcel.writeString(this.knL);
    paramParcel.writeString(this.knM);
    paramParcel.writeString(this.knN);
    paramParcel.writeString(this.knO);
    paramParcel.writeString(this.knP);
    paramParcel.writeString(this.knQ);
    paramParcel.writeString(this.knR);
    paramParcel.writeString(this.knS);
    paramParcel.writeString(this.knT);
    paramParcel.writeString(this.knU);
    paramParcel.writeString(this.hbA);
    if (this.knV) {}
    for (byte b = 1;; b = 0)
    {
      paramParcel.writeByte(b);
      paramParcel.writeInt(this.knW);
      paramParcel.writeInt(this.knX);
      paramParcel.writeInt(this.knY);
      paramParcel.writeString(this.knZ);
      paramParcel.writeString(this.koa);
      paramParcel.writeInt(this.kob);
      paramParcel.writeString(this.koc);
      paramParcel.writeString(this.kod);
      paramParcel.writeString(this.koe);
      paramParcel.writeString(this.kof);
      paramParcel.writeString(this.kog);
      paramParcel.writeString(this.koh);
      paramParcel.writeString(this.koi);
      paramParcel.writeString(this.koj);
      paramParcel.writeString(this.kok);
      paramParcel.writeTypedList(this.kol);
      paramParcel.writeTypedList(this.kom);
      paramParcel.writeString(this.kon);
      paramParcel.writeInt(this.koo);
      paramParcel.writeString(this.kop);
      paramParcel.writeString(this.koq);
      GMTrace.o(4902436732928L, 36526);
      return;
    }
  }
  
  public static class AcceptedCardItem
    implements Parcelable
  {
    public static final Parcelable.Creator<AcceptedCardItem> CREATOR;
    public String kor;
    public String kos;
    
    static
    {
      GMTrace.i(17264157917184L, 128628);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(17264157917184L, 128628);
    }
    
    public AcceptedCardItem()
    {
      GMTrace.i(17263621046272L, 128624);
      GMTrace.o(17263621046272L, 128624);
    }
    
    public AcceptedCardItem(Parcel paramParcel)
    {
      GMTrace.i(17263755264000L, 128625);
      this.kor = paramParcel.readString();
      this.kos = paramParcel.readString();
      GMTrace.o(17263755264000L, 128625);
    }
    
    public int describeContents()
    {
      GMTrace.i(17264023699456L, 128627);
      GMTrace.o(17264023699456L, 128627);
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(17263889481728L, 128626);
      paramParcel.writeString(this.kor);
      paramParcel.writeString(this.kos);
      GMTrace.o(17263889481728L, 128626);
    }
  }
  
  public static class AccepterItem
    implements Parcelable
  {
    public static final Parcelable.Creator<AccepterItem> CREATOR;
    public String kor;
    public String kos;
    public String kot;
    public String kou;
    
    static
    {
      GMTrace.i(17262949957632L, 128619);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(17262949957632L, 128619);
    }
    
    public AccepterItem()
    {
      GMTrace.i(17262413086720L, 128615);
      GMTrace.o(17262413086720L, 128615);
    }
    
    public AccepterItem(Parcel paramParcel)
    {
      GMTrace.i(17262547304448L, 128616);
      this.kor = paramParcel.readString();
      this.kos = paramParcel.readString();
      this.kot = paramParcel.readString();
      this.kou = paramParcel.readString();
      GMTrace.o(17262547304448L, 128616);
    }
    
    public int describeContents()
    {
      GMTrace.i(17262815739904L, 128618);
      GMTrace.o(17262815739904L, 128618);
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(17262681522176L, 128617);
      paramParcel.writeString(this.kor);
      paramParcel.writeString(this.kos);
      paramParcel.writeString(this.kot);
      paramParcel.writeString(this.kou);
      GMTrace.o(17262681522176L, 128617);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/model/CardGiftInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */