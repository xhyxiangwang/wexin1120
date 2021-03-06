package com.tencent.mm.plugin.qqmail.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.loader.stub.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class j
{
  public List<a> gBe;
  public long oFn;
  private e oFo;
  a oFp;
  private int oFq;
  public int oFr;
  private int oFs;
  public int oFt;
  public int status;
  
  j(String paramString)
  {
    GMTrace.i(5450984587264L, 40613);
    this.oFn = 0L;
    this.oFq = 0;
    this.oFr = 1;
    this.oFs = 2;
    this.oFt = 3;
    this.status = this.oFq;
    this.oFo = new e(paramString, 1);
    paramString = e.readFromFile(this.oFo.oEW + "address");
    if (paramString != null)
    {
      this.oFo.a("address", null, paramString);
      b.deleteFile(this.oFo.oEW + "address");
      if (paramString == null) {
        break label222;
      }
    }
    for (;;)
    {
      try
      {
        this.oFp = new a().aB(paramString);
        this.gBe = new ArrayList();
        GMTrace.o(5450984587264L, 40613);
        return;
        paramString = this.oFo.i("address", null);
      }
      catch (IOException paramString)
      {
        com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.Plugin.MailAddrMgr", paramString, "", new Object[0]);
        this.oFp = new a();
        this.oFp.Ec("");
        continue;
      }
      label222:
      this.oFp = new a();
      this.oFp.Ec("");
    }
  }
  
  public static i Ei(String paramString)
  {
    GMTrace.i(5452058329088L, 40621);
    if (paramString == null)
    {
      GMTrace.o(5452058329088L, 40621);
      return null;
    }
    paramString = paramString.trim();
    int i = paramString.trim().lastIndexOf(" ");
    if (i == -1)
    {
      GMTrace.o(5452058329088L, 40621);
      return null;
    }
    i locali = new i();
    locali.name = paramString.substring(0, i);
    locali.nke = paramString.substring(i + 1);
    GMTrace.o(5452058329088L, 40621);
    return locali;
  }
  
  public final List<i> Eh(String paramString)
  {
    GMTrace.i(5451253022720L, 40615);
    Object localObject = this.oFp.oEJ;
    if (this.status <= this.oFr)
    {
      aWQ();
      GMTrace.o(5451253022720L, 40615);
      return (List<i>)localObject;
    }
    if ((paramString == null) || (paramString.length() == 0))
    {
      GMTrace.o(5451253022720L, 40615);
      return (List<i>)localObject;
    }
    ArrayList localArrayList = new ArrayList();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      i locali = (i)((Iterator)localObject).next();
      if ((locali != null) && (((locali.name != null) && (locali.name.contains(paramString))) || ((locali.oFm != null) && (locali.oFm.contains(paramString))) || ((locali.nke != null) && (locali.nke.contains(paramString)))))
      {
        a.b(locali);
        localArrayList.add(locali);
      }
    }
    GMTrace.o(5451253022720L, 40615);
    return localArrayList;
  }
  
  public final void a(a parama)
  {
    GMTrace.i(5451521458176L, 40617);
    Iterator localIterator = this.gBe.iterator();
    while (localIterator.hasNext()) {
      if ((a)localIterator.next() == parama)
      {
        GMTrace.o(5451521458176L, 40617);
        return;
      }
    }
    this.gBe.add(parama);
    GMTrace.o(5451521458176L, 40617);
  }
  
  public final void aWQ()
  {
    GMTrace.i(5451387240448L, 40616);
    if (this.status == this.oFs)
    {
      GMTrace.o(5451387240448L, 40616);
      return;
    }
    if (bg.Pp() - this.oFn <= 600000L)
    {
      localObject = this.gBe.iterator();
      while (((Iterator)localObject).hasNext()) {
        ((a)((Iterator)localObject).next()).onComplete();
      }
      GMTrace.o(5451387240448L, 40616);
      return;
    }
    this.status = this.oFs;
    HashMap localHashMap = new HashMap();
    if (this.oFp.oEH == null) {}
    for (Object localObject = "";; localObject = this.oFp.oEH)
    {
      localHashMap.put("syncinfo", localObject);
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.Plugin.MailAddrMgr", "%s", new Object[] { "sync~~~" });
      localObject = w.aXa();
      p.a local1 = new p.a()
      {
        public final void onComplete()
        {
          GMTrace.i(5471117246464L, 40763);
          j.this.status = j.this.oFt;
          GMTrace.o(5471117246464L, 40763);
        }
        
        public final void onError(int paramAnonymousInt, String paramAnonymousString)
        {
          GMTrace.i(5470983028736L, 40762);
          paramAnonymousString = j.this.gBe.iterator();
          while (paramAnonymousString.hasNext()) {
            ((j.a)paramAnonymousString.next()).onComplete();
          }
          GMTrace.o(5470983028736L, 40762);
        }
        
        public final void onSuccess(String paramAnonymousString, Map<String, String> paramAnonymousMap)
        {
          GMTrace.i(5470848811008L, 40761);
          j localj = j.this;
          int m = bg.getInt((String)paramAnonymousMap.get(".Response.result.Count"), 0);
          if (m > 0)
          {
            int i;
            int j;
            Object localObject1;
            if (localj.oFp.oEJ.size() == 0)
            {
              i = 1;
              j = 0;
              if (j >= m) {
                break label476;
              }
              localObject1 = new StringBuilder(".Response.result.List.item");
              if (j <= 0) {
                break label331;
              }
            }
            String str1;
            Object localObject2;
            int n;
            int k;
            label331:
            for (paramAnonymousString = String.valueOf(j);; paramAnonymousString = "")
            {
              paramAnonymousString = paramAnonymousString + ".";
              String str2 = (String)paramAnonymousMap.get(paramAnonymousString + "Del");
              str1 = (String)paramAnonymousMap.get(paramAnonymousString + "Freq");
              localObject2 = (String)paramAnonymousMap.get(paramAnonymousString + "Name");
              localObject1 = (String)paramAnonymousMap.get(paramAnonymousString + "Addr");
              if ((localObject1 == null) || (((String)localObject1).length() == 0)) {
                break label403;
              }
              if (localObject2 != null)
              {
                paramAnonymousString = (String)localObject2;
                if (((String)localObject2).length() != 0) {}
              }
              else
              {
                paramAnonymousString = (String)localObject1;
              }
              n = ((String)localObject1).hashCode();
              if (!str2.equals("0")) {
                break label412;
              }
              localObject2 = localj.oFp.oEJ;
              k = 0;
              while ((i == 0) && (k < ((List)localObject2).size()) && (((i)((List)localObject2).get(k)).oFk != n)) {
                k += 1;
              }
              i = 0;
              break;
            }
            if ((k >= ((List)localObject2).size()) || (i != 0))
            {
              localObject2 = new i();
              ((i)localObject2).oFk = n;
              ((i)localObject2).name = paramAnonymousString;
              ((i)localObject2).nke = ((String)localObject1);
              ((i)localObject2).oFl = Integer.parseInt(str1);
              localj.oFp.a((i)localObject2);
            }
            label403:
            label412:
            label474:
            for (;;)
            {
              j += 1;
              break;
              paramAnonymousString = localj.oFp.oEJ.iterator();
              k = 0;
              for (;;)
              {
                if (!paramAnonymousString.hasNext()) {
                  break label474;
                }
                if (((i)paramAnonymousString.next()).oFk == n)
                {
                  localj.oFp.sC(k);
                  break;
                }
                k += 1;
              }
            }
            label476:
            localj.oFp.Ec((String)paramAnonymousMap.get(".Response.result.SyncInfo"));
            localj.save();
          }
          if (((String)paramAnonymousMap.get(".Response.result.ContinueFlag")).equals("1"))
          {
            new ae().postDelayed(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(5458903433216L, 40672);
                j.this.status = j.this.oFr;
                j.this.aWQ();
                GMTrace.o(5458903433216L, 40672);
              }
            }, 0L);
            GMTrace.o(5470848811008L, 40761);
            return;
          }
          j.this.oFn = bg.Pp();
          paramAnonymousString = j.this.gBe.iterator();
          while (paramAnonymousString.hasNext()) {
            ((j.a)paramAnonymousString.next()).onComplete();
          }
          GMTrace.o(5470848811008L, 40761);
        }
      };
      ((p)localObject).b("/cgi-bin/syncaddrlist", localHashMap, new p.c(), local1);
      GMTrace.o(5451387240448L, 40616);
      return;
    }
  }
  
  public final void b(a parama)
  {
    GMTrace.i(5451655675904L, 40618);
    Iterator localIterator = this.gBe.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      if (locala == parama)
      {
        this.gBe.remove(locala);
        GMTrace.o(5451655675904L, 40618);
        return;
      }
    }
    GMTrace.o(5451655675904L, 40618);
  }
  
  public final void ba(List<i> paramList)
  {
    GMTrace.i(5451789893632L, 40619);
    a locala = this.oFp;
    if ((paramList == null) || (paramList.size() == 0))
    {
      save();
      GMTrace.o(5451789893632L, 40619);
      return;
    }
    paramList = paramList.iterator();
    label48:
    label150:
    for (;;)
    {
      i locali1;
      Iterator localIterator;
      int i;
      if (paramList.hasNext())
      {
        locali1 = (i)paramList.next();
        localIterator = locala.oEJ.iterator();
        i = 0;
      }
      for (;;)
      {
        if (!localIterator.hasNext()) {
          break label150;
        }
        i locali2 = (i)localIterator.next();
        if (locali2.nke.equalsIgnoreCase(locali1.nke))
        {
          locala.sC(i);
          locali2.oFl += 1;
          locala.a(locali2);
          break label48;
          break;
        }
        i += 1;
      }
    }
  }
  
  protected final void finalize()
  {
    GMTrace.i(5451118804992L, 40614);
    this.gBe.clear();
    GMTrace.o(5451118804992L, 40614);
  }
  
  final void save()
  {
    GMTrace.i(5451924111360L, 40620);
    try
    {
      this.oFo.a("address", null, this.oFp.toByteArray());
      GMTrace.o(5451924111360L, 40620);
      return;
    }
    catch (IOException localIOException)
    {
      com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.Plugin.MailAddrMgr", localIOException, "", new Object[0]);
      GMTrace.o(5451924111360L, 40620);
    }
  }
  
  public static abstract class a
  {
    public a()
    {
      GMTrace.i(5471922552832L, 40769);
      GMTrace.o(5471922552832L, 40769);
    }
    
    public abstract void onComplete();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/qqmail/b/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */