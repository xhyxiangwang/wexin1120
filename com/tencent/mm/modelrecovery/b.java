package com.tencent.mm.modelrecovery;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.recovery.model.RecoveryStatusItem;
import com.tencent.recovery.report.RecoveryReporter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public final class b
{
  public static HashMap<String, Integer> hIO;
  
  static
  {
    GMTrace.i(4514279063552L, 33634);
    HashMap localHashMap = new HashMap();
    hIO = localHashMap;
    localHashMap.put(ab.getPackageName(), Integer.valueOf(0));
    hIO.put(ab.getPackageName() + ":push", Integer.valueOf(20));
    hIO.put(ab.getPackageName() + ":tools", Integer.valueOf(40));
    hIO.put(ab.getPackageName() + ":exdevice", Integer.valueOf(60));
    hIO.put(ab.getPackageName() + ":sandbox", Integer.valueOf(80));
    GMTrace.o(4514279063552L, 33634);
  }
  
  public static void Kk()
  {
    GMTrace.i(4513876410368L, 33631);
    Object localObject = RecoveryReporter.a(ab.getContext(), "ProcessStatus", RecoveryStatusItem.class);
    w.i("MicroMsg.Recovery.WXRecoveryReporter", "reportStatus " + ((List)localObject).size());
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    Iterator localIterator = ((List)localObject).iterator();
    if (localIterator.hasNext())
    {
      RecoveryStatusItem localRecoveryStatusItem = (RecoveryStatusItem)localIterator.next();
      label117:
      b localb;
      label144:
      label173:
      int i;
      if (localHashMap1.containsKey(localRecoveryStatusItem.processName))
      {
        localObject = (a)localHashMap1.get(localRecoveryStatusItem.processName);
        if (!localHashMap2.containsKey(localRecoveryStatusItem.processName)) {
          break label256;
        }
        localb = (b)localHashMap2.get(localRecoveryStatusItem.processName);
        ((a)localObject).hIP += 1;
        if (localRecoveryStatusItem.xsg != 1) {
          break label267;
        }
        ((a)localObject).hIS += 1;
        i = 0;
        switch (localRecoveryStatusItem.xsi)
        {
        }
      }
      for (;;)
      {
        if (i == 0) {
          w.i("MicroMsg.Recovery.WXRecoveryReporter", "recovery statics not set exception");
        }
        localHashMap1.put(localRecoveryStatusItem.processName, localObject);
        localHashMap2.put(localRecoveryStatusItem.processName, localb);
        break;
        localObject = new a();
        break label117;
        label256:
        localb = new b();
        break label144;
        label267:
        ((a)localObject).hIT += 1;
        break label173;
        if (localRecoveryStatusItem.xsg == 1)
        {
          localb.hIV += 1;
          switch (localRecoveryStatusItem.xsj)
          {
          default: 
            break;
          case 4096: 
            localb.hJd += 1;
            i = 1;
            break;
          case 65536: 
          case 1048576: 
            localb.hIZ += 1;
            i = 1;
            break;
          }
        }
        else
        {
          localb.hIW += 1;
          switch (localRecoveryStatusItem.xsj)
          {
          default: 
            break;
          case 4096: 
            localb.hJe += 1;
            i = 1;
            break;
          case 65536: 
          case 1048576: 
            localb.hJa += 1;
            i = 1;
            continue;
            if (localRecoveryStatusItem.xsg == 1)
            {
              localb.hIX += 1;
              switch (localRecoveryStatusItem.xsj)
              {
              default: 
                break;
              case 4096: 
                localb.hJf += 1;
                i = 1;
                break;
              case 65536: 
              case 1048576: 
                localb.hJb += 1;
                i = 1;
                break;
              }
            }
            else
            {
              localb.hIY += 1;
              switch (localRecoveryStatusItem.xsj)
              {
              default: 
                break;
              case 4096: 
                localb.hJg += 1;
                i = 1;
                break;
              case 65536: 
              case 1048576: 
                localb.hJc += 1;
                i = 1;
              }
            }
            break;
          }
        }
      }
    }
    b(localHashMap1);
    c(localHashMap2);
    RecoveryReporter.bs(ab.getContext(), "ProcessStatus");
    GMTrace.o(4513876410368L, 33631);
  }
  
  private static void b(HashMap<String, a> paramHashMap)
  {
    GMTrace.i(4514010628096L, 33632);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramHashMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      if (hIO.containsKey(((Map.Entry)localObject).getKey()))
      {
        int i = ((Integer)hIO.get(((Map.Entry)localObject).getKey())).intValue();
        localObject = (a)((Map.Entry)localObject).getValue();
        IDKey localIDKey;
        if (((a)localObject).hIP > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(424);
          localIDKey.SetKey(i + 0);
          localIDKey.SetValue(((a)localObject).hIP);
          localArrayList.add(localIDKey);
        }
        if (((a)localObject).hIQ > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(424);
          localIDKey.SetKey(i + 1);
          localIDKey.SetValue(((a)localObject).hIQ);
          localArrayList.add(localIDKey);
        }
        if (((a)localObject).hIR > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(424);
          localIDKey.SetKey(i + 2);
          localIDKey.SetValue(((a)localObject).hIR);
          localArrayList.add(localIDKey);
        }
        if (((a)localObject).hIS > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(424);
          localIDKey.SetKey(i + 3);
          localIDKey.SetValue(((a)localObject).hIS);
          localArrayList.add(localIDKey);
        }
        if (((a)localObject).hIT > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(424);
          localIDKey.SetKey(i + 4);
          localIDKey.SetValue(((a)localObject).hIT);
          localArrayList.add(localIDKey);
        }
        if (((a)localObject).hIU > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(424);
          localIDKey.SetKey(i + 5);
          localIDKey.SetValue(((a)localObject).hIU);
          localArrayList.add(localIDKey);
        }
      }
    }
    if (localArrayList.size() > 0) {
      g.paX.b(localArrayList, true);
    }
    w.i("MicroMsg.Recovery.WXRecoveryReporter", "report recovery generalObj %s %s", new Object[] { ab.vR(), paramHashMap.toString() });
    GMTrace.o(4514010628096L, 33632);
  }
  
  private static void c(HashMap<String, b> paramHashMap)
  {
    GMTrace.i(4514144845824L, 33633);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramHashMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      if (hIO.containsKey(((Map.Entry)localObject).getKey()))
      {
        int i = ((Integer)hIO.get(((Map.Entry)localObject).getKey())).intValue();
        localObject = (b)((Map.Entry)localObject).getValue();
        IDKey localIDKey;
        if (((b)localObject).hIV > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(442);
          localIDKey.SetKey(i + 0);
          localIDKey.SetValue(((b)localObject).hIV);
          localArrayList.add(localIDKey);
        }
        if (((b)localObject).hIW > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(442);
          localIDKey.SetKey(i + 1);
          localIDKey.SetValue(((b)localObject).hIW);
          localArrayList.add(localIDKey);
        }
        if (((b)localObject).hIX > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(442);
          localIDKey.SetKey(i + 2);
          localIDKey.SetValue(((b)localObject).hIX);
          localArrayList.add(localIDKey);
        }
        if (((b)localObject).hIY > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(442);
          localIDKey.SetKey(i + 3);
          localIDKey.SetValue(((b)localObject).hIY);
          localArrayList.add(localIDKey);
        }
        if (((b)localObject).hIZ > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(442);
          localIDKey.SetKey(i + 4);
          localIDKey.SetValue(((b)localObject).hIZ);
          localArrayList.add(localIDKey);
        }
        if (((b)localObject).hJa > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(442);
          localIDKey.SetKey(i + 5);
          localIDKey.SetValue(((b)localObject).hJa);
          localArrayList.add(localIDKey);
        }
        if (((b)localObject).hJb > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(442);
          localIDKey.SetKey(i + 6);
          localIDKey.SetValue(((b)localObject).hJb);
          localArrayList.add(localIDKey);
        }
        if (((b)localObject).hJc > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(442);
          localIDKey.SetKey(i + 7);
          localIDKey.SetValue(((b)localObject).hJc);
          localArrayList.add(localIDKey);
        }
        if (((b)localObject).hJd > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(442);
          localIDKey.SetKey(i + 8);
          localIDKey.SetValue(((b)localObject).hJd);
          localArrayList.add(localIDKey);
        }
        if (((b)localObject).hJe > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(442);
          localIDKey.SetKey(i + 9);
          localIDKey.SetValue(((b)localObject).hJe);
          localArrayList.add(localIDKey);
        }
        if (((b)localObject).hJf > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(442);
          localIDKey.SetKey(i + 10);
          localIDKey.SetValue(((b)localObject).hJf);
          localArrayList.add(localIDKey);
        }
        if (((b)localObject).hJg > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(442);
          localIDKey.SetKey(i + 11);
          localIDKey.SetValue(((b)localObject).hJg);
          localArrayList.add(localIDKey);
        }
      }
    }
    if (localArrayList.size() > 0) {
      g.paX.b(localArrayList, true);
    }
    w.i("MicroMsg.Recovery.WXRecoveryReporter", "report recovery statusObj %s %s", new Object[] { ab.vR(), paramHashMap.toString() });
    GMTrace.o(4514144845824L, 33633);
  }
  
  public static final class a
  {
    public int hIP;
    public int hIQ;
    public int hIR;
    public int hIS;
    public int hIT;
    public int hIU;
    
    public a()
    {
      GMTrace.i(4512131579904L, 33618);
      GMTrace.o(4512131579904L, 33618);
    }
    
    public final String toString()
    {
      GMTrace.i(4512265797632L, 33619);
      Object localObject = new StringBuffer();
      if (this.hIP > 0) {
        ((StringBuffer)localObject).append("totalCount:" + this.hIP + " ");
      }
      if (this.hIQ > 0) {
        ((StringBuffer)localObject).append("enterRecoveryCount:" + this.hIQ + " ");
      }
      if (this.hIR > 0) {
        ((StringBuffer)localObject).append("existRecoveryProcessCount:" + this.hIR + " ");
      }
      if (this.hIS > 0) {
        ((StringBuffer)localObject).append("foregroundExpCount:" + this.hIS + " ");
      }
      if (this.hIT > 0) {
        ((StringBuffer)localObject).append("backgroundExpCount:" + this.hIT + " ");
      }
      if (this.hIU > 0) {
        ((StringBuffer)localObject).append("normalCount:" + this.hIU + " ");
      }
      localObject = ((StringBuffer)localObject).toString();
      GMTrace.o(4512265797632L, 33619);
      return (String)localObject;
    }
  }
  
  public static final class b
  {
    public int hIV;
    public int hIW;
    public int hIX;
    public int hIY;
    public int hIZ;
    public int hJa;
    public int hJb;
    public int hJc;
    public int hJd;
    public int hJe;
    public int hJf;
    public int hJg;
    
    public b()
    {
      GMTrace.i(4511863144448L, 33616);
      GMTrace.o(4511863144448L, 33616);
    }
    
    public final String toString()
    {
      GMTrace.i(4511997362176L, 33617);
      Object localObject = new StringBuffer();
      if (this.hIV > 0) {
        ((StringBuffer)localObject).append("appForegroundExpCount:" + this.hIV + " ");
      }
      if (this.hIW > 0) {
        ((StringBuffer)localObject).append("appBackgroundExpCount:" + this.hIW + " ");
      }
      if (this.hIX > 0) {
        ((StringBuffer)localObject).append("componentForegroundExpCount:" + this.hIX + " ");
      }
      if (this.hIY > 0) {
        ((StringBuffer)localObject).append("componentBackgroundExpCount:" + this.hIY + " ");
      }
      if (this.hIZ > 0) {
        ((StringBuffer)localObject).append("appForegroundCrashOrAnrExpCount:" + this.hIZ + " ");
      }
      if (this.hJa > 0) {
        ((StringBuffer)localObject).append("appBackgroundCrashOrAnrExpCount:" + this.hJa + " ");
      }
      if (this.hJb > 0) {
        ((StringBuffer)localObject).append("componentForegroundCrashOrAnrExpCount:" + this.hJb + " ");
      }
      if (this.hJc > 0) {
        ((StringBuffer)localObject).append("componentBackgroundCrashOrAnrExpCount:" + this.hJc + " ");
      }
      if (this.hJd > 0) {
        ((StringBuffer)localObject).append("appForegroundTimeoutExpCount:" + this.hJd + " ");
      }
      if (this.hJe > 0) {
        ((StringBuffer)localObject).append("appBackgroundTimeoutExpCount:" + this.hJe + " ");
      }
      if (this.hJf > 0) {
        ((StringBuffer)localObject).append("componentForegroundTimeoutExpCount:" + this.hJf + " ");
      }
      if (this.hJg > 0) {
        ((StringBuffer)localObject).append("componentBackgroundTimeoutExpCount:" + this.hJg + " ");
      }
      localObject = ((StringBuffer)localObject).toString();
      GMTrace.o(4511997362176L, 33617);
      return (String)localObject;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/modelrecovery/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */