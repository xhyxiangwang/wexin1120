package com.tencent.mm.plugin.wallet_core.ui;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bl.b;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.plugin.wallet.a.f;
import com.tencent.mm.plugin.wallet.a.g;
import com.tencent.mm.plugin.wallet.a.h;
import com.tencent.mm.plugin.wallet.a.q;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.model.ae;
import com.tencent.mm.plugin.wallet_core.model.m;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;

public final class a
{
  public f rSj;
  Map<String, q> rSk;
  Map<String, h> rSl;
  
  public a(f paramf)
  {
    GMTrace.i(6992475193344L, 52098);
    this.rSj = null;
    this.rSk = null;
    this.rSl = null;
    Assert.assertNotNull(paramf);
    this.rSj = paramf;
    PU();
    GMTrace.o(6992475193344L, 52098);
  }
  
  public static String[] JD(String paramString)
  {
    GMTrace.i(6993280499712L, 52104);
    if (bg.mZ(paramString))
    {
      GMTrace.o(6993280499712L, 52104);
      return null;
    }
    paramString = paramString.split("-");
    GMTrace.o(6993280499712L, 52104);
    return paramString;
  }
  
  private void PU()
  {
    int j = 0;
    GMTrace.i(6992609411072L, 52099);
    this.rSk = new HashMap();
    LinkedList localLinkedList = this.rSj.rFS;
    int i;
    Object localObject;
    if (localLinkedList != null)
    {
      i = 0;
      while (i < localLinkedList.size())
      {
        localObject = (q)localLinkedList.get(i);
        this.rSk.put(((q)localObject).rFL, localObject);
        i += 1;
      }
    }
    w.w("MicroMsg.FavorLogicHelper", "func[initData] favorList null");
    this.rSl = new HashMap();
    if ((this.rSj.rFT != null) && (this.rSj.rFT.rGd != null))
    {
      localLinkedList = this.rSj.rFT.rGd;
      i = j;
      while (i < localLinkedList.size())
      {
        localObject = (h)localLinkedList.get(i);
        this.rSl.put(((h)localObject).rGf, localObject);
        i += 1;
      }
      GMTrace.o(6992609411072L, 52099);
      return;
    }
    w.w("MicroMsg.FavorLogicHelper", "func[initData] favorComposeList null");
    GMTrace.o(6992609411072L, 52099);
  }
  
  public static boolean a(FavorPayInfo paramFavorPayInfo, Bankcard paramBankcard)
  {
    GMTrace.i(6993817370624L, 52108);
    if (paramBankcard == null)
    {
      w.w("MicroMsg.FavorLogicHelper", "curBankcard null");
      GMTrace.o(6993817370624L, 52108);
      return true;
    }
    if ((paramFavorPayInfo != null) && (!bg.mZ(paramFavorPayInfo.rOr)))
    {
      if (paramFavorPayInfo.rOs != 0) {}
      for (i = 1; (i != 0) && (!bg.mZ(paramFavorPayInfo.rOt)) && (paramFavorPayInfo.rOw != null) && (paramFavorPayInfo.rOw.contains(paramBankcard.field_bindSerial)); i = 0)
      {
        GMTrace.o(6993817370624L, 52108);
        return false;
      }
    }
    if (paramFavorPayInfo.rOs != 0) {}
    for (int i = 1; (i != 0) && (((!bg.mZ(paramFavorPayInfo.rOt)) && (paramBankcard.field_bankcardType != null) && (!paramBankcard.field_bankcardType.equals(paramFavorPayInfo.rOt))) || ((bg.mZ(paramFavorPayInfo.rOt)) && (paramBankcard.field_bankcardType.equals("CFT")))); i = 0)
    {
      GMTrace.o(6993817370624L, 52108);
      return true;
    }
    GMTrace.o(6993817370624L, 52108);
    return false;
  }
  
  private static String bJ(List<String> paramList)
  {
    GMTrace.i(6993951588352L, 52109);
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    while (i < paramList.size())
    {
      localStringBuilder.append((String)paramList.get(i));
      if (i < paramList.size() - 1) {
        localStringBuilder.append("-");
      }
      i += 1;
    }
    paramList = localStringBuilder.toString();
    GMTrace.o(6993951588352L, 52109);
    return paramList;
  }
  
  public final Map<String, a> JA(String paramString)
  {
    GMTrace.i(6992743628800L, 52100);
    paramString = ax(paramString, false);
    GMTrace.o(6992743628800L, 52100);
    return paramString;
  }
  
  public final List<q> JB(String paramString)
  {
    GMTrace.i(6993012064256L, 52102);
    LinkedList localLinkedList = new LinkedList();
    if (this.rSj.rFS != null)
    {
      paramString = JA(paramString);
      int i = 0;
      if (i < this.rSj.rFS.size())
      {
        q localq = (q)this.rSj.rFS.get(i);
        if (localq != null) {
          if (localq.rGH == 0) {
            break label115;
          }
        }
        label115:
        for (int j = 1;; j = 0)
        {
          if ((j != 0) && (paramString.containsKey(localq.rGI))) {
            localLinkedList.add(localq);
          }
          i += 1;
          break;
        }
      }
    }
    else
    {
      w.w("MicroMsg.FavorLogicHelper", "fucn[getBankFavorListWithSelectedCompId] mFavorInfo.tradeFavList null");
    }
    GMTrace.o(6993012064256L, 52102);
    return localLinkedList;
  }
  
  public final h JC(String paramString)
  {
    GMTrace.i(6993146281984L, 52103);
    paramString = (h)this.rSl.get(paramString);
    GMTrace.o(6993146281984L, 52103);
    return paramString;
  }
  
  public final String JE(String paramString)
  {
    GMTrace.i(6993414717440L, 52105);
    paramString = ay(paramString, false);
    GMTrace.o(6993414717440L, 52105);
    return paramString;
  }
  
  public final FavorPayInfo JF(String paramString)
  {
    GMTrace.i(6993683152896L, 52107);
    FavorPayInfo localFavorPayInfo = new FavorPayInfo();
    if (this.rSl.get(paramString) == null)
    {
      localFavorPayInfo.rOr = "0";
      if (this.rSj != null) {
        localFavorPayInfo.rOu = this.rSj.rFR;
      }
      localFavorPayInfo.rOs = 0;
      GMTrace.o(6993683152896L, 52107);
      return localFavorPayInfo;
    }
    localFavorPayInfo.rOr = paramString;
    if (this.rSj != null) {
      localFavorPayInfo.rOu = this.rSj.rFR;
    }
    localFavorPayInfo.rOs = 0;
    paramString = JD(paramString);
    if (paramString == null)
    {
      GMTrace.o(6993683152896L, 52107);
      return localFavorPayInfo;
    }
    int i = paramString.length - 1;
    for (;;)
    {
      if (i >= 0)
      {
        q localq = (q)this.rSk.get(paramString[i]);
        if (localq != null)
        {
          int j;
          if (localq.rGH != 0) {
            j = 1;
          }
          while (j != 0)
          {
            localFavorPayInfo.rOs = 1;
            if ((localq.rGK != null) && (localq.rGK.size() > 0))
            {
              localFavorPayInfo.rOw = new LinkedList();
              Iterator localIterator = localq.rGK.iterator();
              for (;;)
              {
                if (localIterator.hasNext())
                {
                  b localb = (b)localIterator.next();
                  localFavorPayInfo.rOw.add(n.a(localb));
                  continue;
                  j = 0;
                  break;
                }
              }
            }
            if (bg.mZ(localq.rGI)) {
              break label294;
            }
            localFavorPayInfo.rOt = localq.rGI;
          }
        }
      }
      else
      {
        GMTrace.o(6993683152896L, 52107);
        return localFavorPayInfo;
      }
      label294:
      i -= 1;
    }
  }
  
  public final String JG(String paramString)
  {
    GMTrace.i(6994085806080L, 52110);
    ArrayList localArrayList2 = m.bwE().iJ(true);
    HashMap localHashMap = new HashMap();
    ArrayList localArrayList1 = new ArrayList();
    int i = 0;
    while (i < localArrayList2.size())
    {
      localHashMap.put(((Bankcard)localArrayList2.get(i)).field_bankcardType, Integer.valueOf(0));
      i += 1;
    }
    paramString = JD(paramString);
    if (paramString != null)
    {
      i = 0;
      if (i < paramString.length)
      {
        localArrayList2 = paramString[i];
        q localq = (q)this.rSk.get(localArrayList2);
        int j;
        if (localq != null) {
          if (localq.rGH != 0)
          {
            j = 1;
            label131:
            if (j == 0) {
              break label183;
            }
            if ((localHashMap.containsKey(localq.rGI)) || (bg.mZ(localq.rGI))) {
              localArrayList1.add(localArrayList2);
            }
          }
        }
        for (;;)
        {
          i += 1;
          break;
          j = 0;
          break label131;
          label183:
          localArrayList1.add(localArrayList2);
        }
      }
    }
    if (localArrayList1.size() == 0)
    {
      GMTrace.o(6994085806080L, 52110);
      return "0";
    }
    paramString = bJ(localArrayList1);
    GMTrace.o(6994085806080L, 52110);
    return paramString;
  }
  
  public final Map<String, a> ax(String paramString, boolean paramBoolean)
  {
    GMTrace.i(6992877846528L, 52101);
    HashMap localHashMap = new HashMap();
    LinkedList localLinkedList;
    if ((this.rSj.rFT != null) && (this.rSj.rFT.rGd != null))
    {
      localLinkedList = this.rSj.rFT.rGd;
      if (!this.rSl.containsKey(paramString)) {
        break label441;
      }
    }
    label141:
    label415:
    label441:
    for (double d = ((h)this.rSl.get(paramString)).rGg;; d = 0.0D)
    {
      int i = 0;
      if (i < localLinkedList.size())
      {
        h localh = (h)localLinkedList.get(i);
        a locala = null;
        Object localObject;
        if ((paramString.equals("0")) && (!localh.equals("0")))
        {
          localObject = localh.rGf;
          localObject = JD((String)localObject);
          if ((localObject != null) && (localObject.length > 0))
          {
            localObject = (q)this.rSk.get(localObject[0]);
            if (localObject != null) {
              if (((q)localObject).rGH == 0) {
                break label415;
              }
            }
          }
        }
        for (int j = 1;; j = 0)
        {
          if ((j != 0) && (!bg.mZ(((q)localObject).rGI)) && (((q)localObject).rGK.size() <= 0) && ((paramBoolean) || (!((q)localObject).rGI.equalsIgnoreCase("CFT"))))
          {
            locala = (a)localHashMap.get(((q)localObject).rGI);
            if ((locala == null) || (localh.rGg > locala.rSm.rGg))
            {
              locala = new a();
              locala.rSm = localh;
              locala.org = ((q)localObject).org;
              locala.rSn = (localh.rGg - d);
              locala.rSo = ((q)localObject).rGI;
              localHashMap.put(((q)localObject).rGI, locala);
            }
          }
          i += 1;
          break;
          localObject = locala;
          if (!localh.rGf.startsWith(paramString)) {
            break label141;
          }
          localObject = locala;
          if (paramString.equals(localh.rGf)) {
            break label141;
          }
          localObject = localh.rGf.replace(paramString + "-", "");
          break label141;
        }
        w.w("MicroMsg.FavorLogicHelper", "favorComposeList null or favorComposeList.favorComposeInfo null");
      }
      GMTrace.o(6992877846528L, 52101);
      return localHashMap;
    }
  }
  
  public final String ay(String paramString, boolean paramBoolean)
  {
    GMTrace.i(6993548935168L, 52106);
    paramString = JD(paramString);
    if (paramString != null)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      int i = 0;
      if (i < paramString.length)
      {
        q localq = (q)this.rSk.get(paramString[i]);
        if (localq != null) {
          if (localq.rGH == 0) {
            break label125;
          }
        }
        label125:
        for (int j = 1;; j = 0)
        {
          if ((j == 0) || ((bg.mZ(localq.rGI)) && (!paramBoolean)))
          {
            localStringBuilder.append(paramString[i]);
            localStringBuilder.append("-");
          }
          i += 1;
          break;
        }
      }
      if (localStringBuilder.length() == 0)
      {
        GMTrace.o(6993548935168L, 52106);
        return "0";
      }
      paramString = localStringBuilder.delete(localStringBuilder.length() - 1, localStringBuilder.length()).toString();
      GMTrace.o(6993548935168L, 52106);
      return paramString;
    }
    GMTrace.o(6993548935168L, 52106);
    return "0";
  }
  
  public final List<q> bxy()
  {
    GMTrace.i(6994220023808L, 52111);
    Object localObject = m.bwE().iJ(true);
    HashMap localHashMap = new HashMap();
    int i = 0;
    while (i < ((ArrayList)localObject).size())
    {
      localHashMap.put(((Bankcard)((ArrayList)localObject).get(i)).field_bankcardType, Integer.valueOf(0));
      i += 1;
    }
    localObject = new LinkedList();
    LinkedList localLinkedList = this.rSj.rFS;
    if (localLinkedList != null)
    {
      i = 0;
      if (i < localLinkedList.size())
      {
        q localq = (q)localLinkedList.get(i);
        int j;
        if (localq != null) {
          if (localq.rGH != 0)
          {
            j = 1;
            label131:
            if (j == 0) {
              break label182;
            }
            if ((localHashMap.containsKey(localq.rGI)) || (bg.mZ(localq.rGI))) {
              ((List)localObject).add(localq);
            }
          }
        }
        for (;;)
        {
          i += 1;
          break;
          j = 0;
          break label131;
          label182:
          ((List)localObject).add(localq);
        }
      }
    }
    GMTrace.o(6994220023808L, 52111);
    return (List<q>)localObject;
  }
  
  public static final class a
  {
    public String org;
    public h rSm;
    public double rSn;
    public String rSo;
    
    public a()
    {
      GMTrace.i(6983751041024L, 52033);
      GMTrace.o(6983751041024L, 52033);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */