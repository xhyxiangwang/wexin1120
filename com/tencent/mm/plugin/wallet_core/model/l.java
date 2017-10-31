package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.ui.a;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public abstract class l<K>
{
  Map<String, Integer> rOE;
  List<K> rOF;
  public Vector<l<K>.b> rOG;
  List<String> rOH;
  
  public l()
  {
    GMTrace.i(6872484544512L, 51204);
    this.rOE = new HashMap();
    this.rOF = new LinkedList();
    this.rOG = new Vector();
    this.rOH = new LinkedList();
    GMTrace.o(6872484544512L, 51204);
  }
  
  public abstract String a(Vector<l<K>.b> paramVector, int paramInt);
  
  public final void bwx()
  {
    GMTrace.i(6873021415424L, 51208);
    int i = 0;
    int j;
    if (i < this.rOG.size()) {
      if (((b)this.rOG.get(i)).rOO != a.rOK)
      {
        Object localObject = a(this.rOG, i);
        if (this.rOE.containsKey(localObject)) {
          break label166;
        }
        localObject = a.JD((String)localObject);
        j = 0;
        label75:
        if (j >= this.rOH.size()) {
          break label161;
        }
        k = 0;
        label90:
        if (k >= localObject.length) {
          break label186;
        }
        if (((String)this.rOH.get(j)).contains(localObject[k])) {
          break label147;
        }
      }
    }
    label128:
    label147:
    label161:
    label166:
    label186:
    for (int k = 0;; k = 1)
    {
      if (k != 0)
      {
        j = 1;
        if (j != 0) {
          break label166;
        }
        dw(i, a.rOJ);
      }
      for (;;)
      {
        i += 1;
        break;
        k += 1;
        break label90;
        j += 1;
        break label75;
        j = 0;
        break label128;
        dw(i, a.rOL);
      }
      GMTrace.o(6873021415424L, 51208);
      return;
    }
  }
  
  public final void c(List<K> paramList1, List<K> paramList2, List<String> paramList)
  {
    GMTrace.i(6872752979968L, 51206);
    this.rOH = paramList;
    this.rOF = paramList2;
    this.rOG.clear();
    this.rOG = new Vector(paramList1.size());
    int i = 0;
    if (i < paramList1.size())
    {
      paramList2 = new b();
      Object localObject = paramList1.get(i);
      paramList2.rON = localObject;
      if (this.rOF.contains(localObject)) {}
      for (paramList2.rOO = a.rOK;; paramList2.rOO = a.rOJ)
      {
        this.rOG.add(paramList2);
        i += 1;
        break;
      }
    }
    this.rOE.clear();
    i = 0;
    while (i < paramList.size())
    {
      this.rOE.put(paramList.get(i), Integer.valueOf(0));
      i += 1;
    }
    bwx();
    GMTrace.o(6872752979968L, 51206);
  }
  
  public final void dw(int paramInt1, int paramInt2)
  {
    GMTrace.i(6872887197696L, 51207);
    ((b)this.rOG.get(paramInt1)).rOO = paramInt2;
    GMTrace.o(6872887197696L, 51207);
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(6902549315584L, 51428);
      rOJ = 1;
      rOK = 2;
      rOL = 3;
      rOM = new int[] { rOJ, rOK, rOL };
      GMTrace.o(6902549315584L, 51428);
    }
    
    public static int[] bwy()
    {
      GMTrace.i(6902415097856L, 51427);
      int[] arrayOfInt = (int[])rOM.clone();
      GMTrace.o(6902415097856L, 51427);
      return arrayOfInt;
    }
  }
  
  public final class b
  {
    public K rON;
    public int rOO;
    
    public b()
    {
      GMTrace.i(6892482985984L, 51353);
      GMTrace.o(6892482985984L, 51353);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */