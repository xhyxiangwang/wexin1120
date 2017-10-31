package com.tencent.mm.plugin.sns.ui;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.ai;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.protocal.c.nn;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class au
  extends e<m>
{
  private boolean fAk;
  List<m> fIU;
  private String lBB;
  private Comparator<m> pZP;
  private boolean qNx;
  private b qNy;
  private a qNz;
  private int qwJ;
  private int qwK;
  private String userName;
  
  public au(b paramb, String paramString, boolean paramBoolean)
  {
    GMTrace.i(8345926762496L, 62182);
    this.userName = "";
    this.fIU = new ArrayList();
    this.fAk = false;
    this.qwJ = 0;
    this.qwK = 0;
    this.lBB = "";
    this.qNx = false;
    this.pZP = new Comparator() {};
    this.qNy = paramb;
    this.userName = paramString;
    this.fAk = paramBoolean;
    GMTrace.o(8345926762496L, 62182);
  }
  
  private void b(boolean paramBoolean, List<m> paramList)
  {
    GMTrace.i(8346732068864L, 62188);
    this.qNz = new a();
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    HashMap localHashMap3 = new HashMap();
    long l = System.currentTimeMillis();
    Object localObject;
    if ((paramBoolean) && (this.fAk))
    {
      localObject = new m((byte)0);
      ((m)localObject).field_snsId = 0L;
      ((m)localObject).quQ = -1;
      ((m)localObject).fZ((int)(System.currentTimeMillis() / 1000L));
      paramList.add(0, localObject);
    }
    int i3 = paramList.size();
    w.d("MicroMsg.SnsSelfHelper", "initFixType " + i3);
    int i1 = 0;
    int j = 0;
    int n = 0;
    int m = 0;
    if (n < i3)
    {
      localObject = this.qNz;
      ((a)localObject).qNC = -1;
      ((a)localObject).qNM = -1;
      ((a)localObject).qNB = -1;
      ((a)localObject).qNG = "";
      ((a)localObject).qNH = "";
      ((a)localObject).qNI = "";
      ((a)localObject).qNL = false;
      ((a)localObject).qND = false;
      ((a)localObject).qNN = false;
      ((a)localObject).qNO = -1;
      ((a)localObject).qNE = -1;
      ((a)localObject).qNJ = -1;
      ((a)localObject).qNK = 0;
      ((a)localObject).qNF = 0;
      ((a)localObject).qNP = 0;
      int i;
      label269:
      int i2;
      if ((this.fAk) && (n == 0))
      {
        i = 1;
        localHashMap1.put(Integer.valueOf(m), Integer.valueOf(j));
        localHashMap2.put(Integer.valueOf(m), Integer.valueOf(i));
        i2 = j + i;
        localHashMap3.put(Integer.valueOf(m), Integer.valueOf(i1));
        if ((!this.fAk) || (n != 0)) {
          break label1043;
        }
        j = 0;
      }
      for (;;)
      {
        i1 += j;
        n += i;
        m += 1;
        j = i2;
        break;
        bhc localbhc;
        if (n + 1 < i3)
        {
          localObject = (m)paramList.get(n + 1);
          this.qNz.qNC = ((m)localObject).field_head;
          localbhc = ((m)localObject).bjL();
          this.qNz.qNG = localbhc.uyr;
          this.qNz.qND = ai.F(((m)localObject).field_localPrivate, this.fAk);
          this.qNz.qNE = ((m)localObject).field_type;
          if (localbhc.uyu != null) {
            this.qNz.qNF = localbhc.uyu.tKd.size();
          }
        }
        else
        {
          label481:
          if (n + 2 < i3)
          {
            localObject = (m)paramList.get(n + 2);
            this.qNz.qNM = ((m)localObject).field_head;
            localbhc = ((m)localObject).bjL();
            this.qNz.qNH = localbhc.uyr;
            this.qNz.qNN = ai.F(((m)localObject).field_localPrivate, this.fAk);
            this.qNz.qNO = ((m)localObject).field_type;
            if (localbhc.uyu == null) {
              break label731;
            }
            this.qNz.qNP = localbhc.uyu.tKd.size();
          }
          label593:
          localObject = (m)paramList.get(n);
          this.qNz.qNB = ((m)localObject).field_head;
          localbhc = ((m)localObject).bjL();
          this.qNz.qNI = localbhc.uyr;
          this.qNz.qNJ = ((m)localObject).field_type;
          this.qNz.qNL = ai.F(((m)localObject).field_localPrivate, this.fAk);
          if (localbhc.uyu == null) {
            break label742;
          }
          this.qNz.qNK = localbhc.uyu.tKd.size();
          label694:
          localObject = this.qNz;
          if (((a)localObject).qNJ != 2) {
            break label753;
          }
          i = 1;
        }
        for (;;)
        {
          if (i == 0) {
            break label915;
          }
          i = 1;
          break;
          this.qNz.qNF = 0;
          break label481;
          label731:
          this.qNz.qNP = 0;
          break label593;
          label742:
          this.qNz.qNK = 0;
          break label694;
          label753:
          if (((a)localObject).qNC == -1) {
            i = 1;
          } else if (((a)localObject).qNJ != ((a)localObject).qNE) {
            i = 1;
          } else if (a.vd(((a)localObject).qNJ)) {
            i = 1;
          } else if (a.vd(((a)localObject).qNE)) {
            i = 1;
          } else if ((((a)localObject).qNK > 1) || (((a)localObject).qNF > 1)) {
            i = 1;
          } else if ((((a)localObject).qNI != null) && (!((a)localObject).qNI.equals(""))) {
            i = 1;
          } else if ((((a)localObject).qNG != null) && (!((a)localObject).qNG.equals(""))) {
            i = 1;
          } else if (((a)localObject).qNB != ((a)localObject).qNC) {
            i = 1;
          } else {
            i = 0;
          }
        }
        label915:
        localObject = this.qNz;
        if (((a)localObject).qNM == -1) {
          i = 1;
        }
        for (;;)
        {
          if (i == 0) {
            break label1038;
          }
          i = 2;
          break;
          if (((a)localObject).qNE != ((a)localObject).qNO) {
            i = 1;
          } else if (a.vd(((a)localObject).qNO)) {
            i = 1;
          } else if (((a)localObject).qNP > 1) {
            i = 1;
          } else if ((((a)localObject).qNH != null) && (!((a)localObject).qNH.equals(""))) {
            i = 1;
          } else if (((a)localObject).qNC != ((a)localObject).qNM) {
            i = 1;
          } else {
            i = 0;
          }
        }
        label1038:
        i = 3;
        break label269;
        label1043:
        int k = 0;
        j = k;
        if (i > 0)
        {
          j = k;
          if (this.qNz.qNJ == 1) {
            j = 1;
          }
        }
        k = j;
        if (i >= 2)
        {
          k = j;
          if (this.qNz.qNE == 1) {
            k = j + 1;
          }
        }
        j = k;
        if (i >= 3)
        {
          j = k;
          if (this.qNz.qNO == 1) {
            j = k + 1;
          }
        }
      }
    }
    this.qwJ = m;
    this.qwK = paramList.size();
    w.d("MicroMsg.SnsSelfHelper", "icount " + this.qwJ);
    this.fIU = paramList;
    i.T("SnsphotoAdapter initFixType ", l);
    this.qNy.a(this.fIU, localHashMap1, localHashMap2, localHashMap3, this.qwK, this.qwJ);
    GMTrace.o(8346732068864L, 62188);
  }
  
  public final List<m> bkK()
  {
    GMTrace.i(8346195197952L, 62184);
    List localList = ai.a(this.userName, this.fAk, this.lBB, this.qNx);
    w.i("MicroMsg.SnsSelfHelper", "loadData thread: %d count: %d", new Object[] { Long.valueOf(Thread.currentThread().getId()), Integer.valueOf(localList.size()) });
    GMTrace.o(8346195197952L, 62184);
    return localList;
  }
  
  public final void bnv()
  {
    GMTrace.i(8346329415680L, 62185);
    Collections.sort(this.fIU, this.pZP);
    GMTrace.o(8346329415680L, 62185);
  }
  
  final void bnw()
  {
    GMTrace.i(8346463633408L, 62186);
    b(false, this.fIU);
    GMTrace.o(8346463633408L, 62186);
  }
  
  public final void bx(List<m> paramList)
  {
    GMTrace.i(8346060980224L, 62183);
    if (this.qNy != null)
    {
      if (paramList != null) {
        b(true, paramList);
      }
      this.qNy.bnu();
    }
    GMTrace.o(8346060980224L, 62183);
  }
  
  public final void e(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(8346597851136L, 62187);
    w.d("MicroMsg.SnsSelfHelper", "limitSeq " + paramString);
    this.lBB = paramString;
    this.qNx = paramBoolean1;
    fM(paramBoolean2);
    GMTrace.o(8346597851136L, 62187);
  }
  
  final class a
  {
    public int qNB;
    public int qNC;
    public boolean qND;
    public int qNE;
    public int qNF;
    public String qNG;
    public String qNH;
    public String qNI;
    public int qNJ;
    public int qNK;
    public boolean qNL;
    public int qNM;
    public boolean qNN;
    public int qNO;
    public int qNP;
    
    a()
    {
      GMTrace.i(8505645858816L, 63372);
      this.qNB = -1;
      this.qNC = -1;
      this.qND = false;
      this.qNE = -1;
      this.qNF = 0;
      this.qNG = "";
      this.qNH = "";
      this.qNI = "";
      this.qNJ = -1;
      this.qNK = 0;
      this.qNL = false;
      this.qNM = -1;
      this.qNN = false;
      this.qNO = -1;
      this.qNP = 0;
      GMTrace.o(8505645858816L, 63372);
    }
    
    public static boolean vd(int paramInt)
    {
      GMTrace.i(8505780076544L, 63373);
      switch (paramInt)
      {
      case 9: 
      case 10: 
      case 11: 
      case 12: 
      case 13: 
      case 14: 
      case 16: 
      case 17: 
      default: 
        GMTrace.o(8505780076544L, 63373);
        return false;
      }
      GMTrace.o(8505780076544L, 63373);
      return true;
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(List<m> paramList, Map<Integer, Integer> paramMap1, Map<Integer, Integer> paramMap2, Map<Integer, Integer> paramMap3, int paramInt1, int paramInt2);
    
    public abstract void bnu();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */