package com.tencent.mm.plugin.sns.model;

import android.content.Intent;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.k;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.plugin.sns.b.c;
import com.tencent.mm.plugin.sns.b.h.a;
import com.tencent.mm.plugin.sns.storage.f;
import com.tencent.mm.plugin.sns.storage.u;
import com.tencent.mm.protocal.c.bct;
import com.tencent.mm.protocal.c.bcu;
import com.tencent.mm.protocal.c.bcz;
import com.tencent.mm.protocal.c.bdk;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class al
{
  public static final class a
    implements com.tencent.mm.ac.e, com.tencent.mm.plugin.sns.b.h
  {
    public static int qeu;
    Map<h.a, String> hmO;
    public Map<String, ArrayList<com.tencent.mm.plugin.sns.g.b>> qeA;
    public Map<String, Integer> qeB;
    private Map<String, Long> qev;
    private Map<String, Integer> qew;
    private int qex;
    public long qey;
    private LinkedList<String> qez;
    
    static
    {
      GMTrace.i(8147016089600L, 60700);
      qeu = -1;
      GMTrace.o(8147016089600L, 60700);
    }
    
    public a()
    {
      GMTrace.i(8144331735040L, 60680);
      this.qev = new HashMap();
      this.qew = new HashMap();
      this.qex = 0;
      this.qey = 0L;
      this.hmO = new HashMap();
      this.qez = new LinkedList();
      this.qeA = new HashMap();
      this.qeB = new HashMap();
      GMTrace.o(8144331735040L, 60680);
    }
    
    public static void GI(String paramString)
    {
      GMTrace.i(8145942347776L, 60692);
      Object localObject = ae.bho();
      if (bg.mZ(((ac)localObject).gCs)) {
        ((ac)localObject).gCs = com.tencent.mm.x.m.zF();
      }
      localObject = ((ac)localObject).gCs;
      com.tencent.mm.plugin.sns.storage.m localm = com.tencent.mm.plugin.sns.storage.h.Hz(paramString);
      for (;;)
      {
        try
        {
          bdk localbdk = (bdk)new bdk().aC(localm.field_attrBuf);
          Iterator localIterator = localbdk.uvi.iterator();
          if (localIterator.hasNext())
          {
            bcz localbcz = (bcz)localIterator.next();
            if (!localbcz.twR.equals(localObject)) {
              continue;
            }
            localbdk.uvi.remove(localbcz);
            localbdk.uvg -= 1;
            localm.field_attrBuf = localbdk.toByteArray();
            if (!localm.uF(32)) {
              continue;
            }
            ae.bhr().a(localm.bkr());
          }
        }
        catch (Exception localException)
        {
          continue;
          String str = localException.iLj;
          continue;
          com.tencent.mm.kernel.h.xA();
          com.tencent.mm.kernel.h.xy().gQO.a(new q(u.HU(paramString), 5), 0);
          GMTrace.o(8145942347776L, 60692);
        }
        if (!ae.bho().dD(u.HU(paramString))) {
          continue;
        }
        if (!localm.uF(32)) {
          continue;
        }
        localObject = localm.bjJ();
        if (localObject != null) {
          continue;
        }
        localObject = "";
        ((c)com.tencent.mm.kernel.h.h(c.class)).a(11855, localm.bkt(), new Object[] { Integer.valueOf(0), localObject, Integer.valueOf(localm.bkt()) });
        com.tencent.mm.kernel.h.xA();
        com.tencent.mm.kernel.h.xy().gQO.a(new q(u.HU(paramString), 7), 0);
        GMTrace.o(8145942347776L, 60692);
        return;
        ae.bhp().z(localm);
      }
    }
    
    public static bcz a(com.tencent.mm.plugin.sns.storage.m paramm, int paramInt, String paramString)
    {
      GMTrace.i(8146076565504L, 60693);
      paramm = a(paramm, paramInt, paramString, null, false, 0, 0);
      GMTrace.o(8146076565504L, 60693);
      return paramm;
    }
    
    public static bcz a(com.tencent.mm.plugin.sns.storage.m paramm, int paramInt1, String paramString, bcz parambcz, int paramInt2)
    {
      GMTrace.i(14313246949376L, 106642);
      paramm = a(paramm, paramInt1, paramString, parambcz, false, paramInt2);
      GMTrace.o(14313246949376L, 106642);
      return paramm;
    }
    
    public static bcz a(com.tencent.mm.plugin.sns.storage.m paramm, int paramInt1, String paramString, bcz parambcz, boolean paramBoolean, int paramInt2)
    {
      GMTrace.i(15698642337792L, 116964);
      paramm = a(paramm, paramInt1, paramString, parambcz, paramBoolean, 0, paramInt2);
      GMTrace.o(15698642337792L, 116964);
      return paramm;
    }
    
    private static bcz a(com.tencent.mm.plugin.sns.storage.m paramm, int paramInt1, String paramString, bcz parambcz, boolean paramBoolean, int paramInt2, int paramInt3)
    {
      GMTrace.i(14313515384832L, 106644);
      bct localbct = new bct();
      localbct.ovi = paramString;
      localbct.orU = ((int)(bg.Pp() / 1000L));
      localbct.uuB = com.tencent.mm.x.m.zH();
      localbct.upg = com.tencent.mm.x.m.zF();
      localbct.twh = 0;
      localbct.uuC = ((com.tencent.mm.plugin.messenger.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.a.a.class)).fc(paramm.field_userName);
      localbct.tMZ = paramm.field_userName;
      localbct.jXP = paramInt1;
      localbct.uuJ = paramInt3;
      long l;
      Object localObject1;
      label143:
      bcu localbcu;
      if (paramm.uF(32)) {
        if (parambcz == null)
        {
          l = 0L;
          localbct.uuG = l;
          localObject1 = new bct();
          if (parambcz != null) {
            break label471;
          }
          paramString = "";
          ((bct)localObject1).upg = paramString;
          localbcu = new bcu();
          localbcu.tDg = paramm.field_snsId;
          localbcu.uuL = localbct;
          localbcu.uuM = ((bct)localObject1);
          localObject1 = "";
          if (paramm.uF(32))
          {
            paramString = paramm.bjJ();
            if (paramString != null) {
              break label479;
            }
            localObject1 = "";
            label207:
            if (paramString != null) {
              break label488;
            }
            paramString = "";
            label214:
            if (localbct.jXP != 7) {
              break label496;
            }
            ((c)com.tencent.mm.kernel.h.h(c.class)).a(11855, paramm.bkt(), new Object[] { Integer.valueOf(1), localObject1, Integer.valueOf(paramm.bkt()) });
            label270:
            localObject2 = paramm.bkr();
            localObject1 = paramString;
            if (localObject2 != null)
            {
              localObject1 = paramString;
              if (((com.tencent.mm.plugin.sns.storage.e)localObject2).field_firstControlTime == 0)
              {
                ((com.tencent.mm.plugin.sns.storage.e)localObject2).field_firstControlTime = localbct.orU;
                ae.bhr().b(((com.tencent.mm.plugin.sns.storage.e)localObject2).field_snsId, (com.tencent.mm.plugin.sns.storage.e)localObject2);
                localObject1 = paramString;
              }
            }
          }
          Object localObject2 = com.tencent.mm.a.g.n(bg.Pq().getBytes());
          paramString = (String)localObject2;
          if (paramm.uF(32)) {
            paramString = "_AD_TAG_" + (String)localObject2;
          }
          if (!ae.bho().a(paramString, localbcu)) {
            break label583;
          }
          if (!ac.Gz(paramString)) {
            break label555;
          }
          com.tencent.mm.kernel.h.xA();
          com.tencent.mm.kernel.h.xy().gQO.a(new j(localbcu, paramString, (String)localObject1), 0);
        }
      }
      for (;;)
      {
        if (paramBoolean) {
          break label595;
        }
        GMTrace.o(14313515384832L, 106644);
        return null;
        l = parambcz.uuH;
        break;
        if (parambcz == null) {}
        for (paramInt1 = 0;; paramInt1 = parambcz.uuE)
        {
          localbct.uuD = paramInt1;
          break;
        }
        label471:
        paramString = parambcz.twR;
        break label143;
        label479:
        localObject1 = paramString.iLj;
        break label207;
        label488:
        paramString = paramString.qhb;
        break label214;
        label496:
        if (localbct.jXP != 8) {
          break label270;
        }
        ((c)com.tencent.mm.kernel.h.h(c.class)).a(11855, paramm.bkt(), new Object[] { Integer.valueOf(2), localObject1, Integer.valueOf(paramm.bkt()) });
        break label270;
        label555:
        com.tencent.mm.kernel.h.xA();
        com.tencent.mm.kernel.h.xy().gQO.a(new n(localbcu, paramString), 0);
        continue;
        label583:
        w.e("MicroMsg.SnsService", "can not add Comment");
      }
      label595:
      paramString = new bcz();
      paramString.orU = localbct.orU;
      paramString.jXP = localbct.jXP;
      paramString.twh = localbct.twh;
      paramString.twR = localbct.upg;
      paramString.ufQ = localbct.uuB;
      paramString.ovi = localbct.ovi;
      paramString.uuJ = localbct.uuJ;
      if (paramm.uF(32)) {
        if (parambcz == null)
        {
          l = 0L;
          paramString.uuG = l;
          if (parambcz != null) {
            break label742;
          }
        }
      }
      label742:
      for (paramm = "";; paramm = parambcz.twR)
      {
        paramString.uuY = paramm;
        GMTrace.o(14313515384832L, 106644);
        return paramString;
        l = parambcz.uuH;
        break;
        if (parambcz == null) {}
        for (paramInt1 = 0;; paramInt1 = parambcz.uuE)
        {
          paramString.uuD = paramInt1;
          break;
        }
      }
    }
    
    public static bcz a(com.tencent.mm.plugin.sns.storage.m paramm, int paramInt1, String paramString1, String paramString2, int paramInt2)
    {
      GMTrace.i(8146479218688L, 60696);
      bct localbct = new bct();
      localbct.ovi = paramString1;
      localbct.orU = ((int)(bg.Pp() / 1000L));
      localbct.uuB = com.tencent.mm.x.m.zH();
      localbct.upg = com.tencent.mm.x.m.zF();
      localbct.twh = paramInt2;
      localbct.uuC = ((com.tencent.mm.plugin.messenger.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.a.a.class)).fc(paramm.field_userName);
      localbct.tMZ = paramm.field_userName;
      localbct.jXP = paramInt1;
      bcu localbcu;
      String str;
      if (paramm.uF(32))
      {
        localbct.uuG = 0L;
        paramString1 = new bct();
        paramString1.upg = paramString2;
        localbcu = new bcu();
        localbcu.tDg = paramm.field_snsId;
        localbcu.uuL = localbct;
        localbcu.uuM = paramString1;
        str = "";
        if (paramm.uF(32))
        {
          paramString1 = paramm.bjJ();
          if (paramString1 != null) {
            break label367;
          }
          paramString2 = "";
          label182:
          if (paramString1 != null) {
            break label375;
          }
          paramString1 = "";
          label189:
          if (localbct.jXP != 7) {
            break label383;
          }
          ((c)com.tencent.mm.kernel.h.h(c.class)).a(11855, paramm.bkt(), new Object[] { Integer.valueOf(1), paramString2, Integer.valueOf(paramm.bkt()) });
          str = paramString1;
        }
        label247:
        paramString2 = com.tencent.mm.a.g.n(bg.Pq().getBytes());
        paramString1 = paramString2;
        if (paramm.uF(32)) {
          paramString1 = "_AD_TAG_" + paramString2;
        }
        if (!ae.bho().a(paramString1, localbcu, str)) {
          break label475;
        }
        if (!ac.Gz(paramString1)) {
          break label447;
        }
        com.tencent.mm.kernel.h.xA();
        com.tencent.mm.kernel.h.xy().gQO.a(new j(localbcu, paramString1, str), 0);
      }
      for (;;)
      {
        GMTrace.o(8146479218688L, 60696);
        return null;
        localbct.uuD = 0;
        break;
        label367:
        paramString2 = paramString1.iLj;
        break label182;
        label375:
        paramString1 = paramString1.qhb;
        break label189;
        label383:
        str = paramString1;
        if (localbct.jXP != 8) {
          break label247;
        }
        ((c)com.tencent.mm.kernel.h.h(c.class)).a(11855, paramm.bkt(), new Object[] { Integer.valueOf(2), paramString2, Integer.valueOf(paramm.bkt()) });
        str = paramString1;
        break label247;
        label447:
        com.tencent.mm.kernel.h.xA();
        com.tencent.mm.kernel.h.xy().gQO.a(new n(localbcu, paramString1), 0);
        continue;
        label475:
        w.e("MicroMsg.SnsService", "can not add Comment");
      }
    }
    
    public static void a(String paramString1, int paramInt1, String paramString2, com.tencent.mm.plugin.sns.storage.m paramm, int paramInt2)
    {
      GMTrace.i(8146613436416L, 60697);
      if ((paramInt1 != 3) && (paramInt1 != 5))
      {
        GMTrace.o(8146613436416L, 60697);
        return;
      }
      bct localbct = new bct();
      localbct.ovi = paramString2;
      localbct.orU = ((int)(System.currentTimeMillis() / 1000L));
      localbct.uuB = com.tencent.mm.x.m.zH();
      localbct.upg = com.tencent.mm.x.m.zF();
      localbct.twh = paramInt2;
      localbct.uuC = ((com.tencent.mm.plugin.messenger.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.a.a.class)).fc(paramString1);
      localbct.tMZ = paramString1;
      localbct.jXP = paramInt1;
      paramString2 = new bcu();
      paramString2.tDg = paramm.field_snsId;
      paramString2.uuL = localbct;
      paramString2.uuM = new bct();
      String str = com.tencent.mm.a.g.n(bg.Pq().getBytes());
      long l = paramm.field_snsId;
      try
      {
        w.v("MicroMsg.SnsService", "comment stg inserted");
        paramm = new com.tencent.mm.plugin.sns.storage.i();
        paramm.field_talker = paramString1;
        paramm.field_snsID = l;
        paramm.field_createTime = ((int)(System.currentTimeMillis() / 1000L));
        paramm.field_curActionBuf = localbct.toByteArray();
        paramm.field_type = paramInt1;
        paramm.field_isSend = true;
        paramm.field_isRead = 1;
        ae.bht().b(paramm);
        ae.bho().a(str, paramString2);
        GMTrace.o(8146613436416L, 60697);
        return;
      }
      catch (Exception paramString1)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.SnsService", paramString1, "", new Object[0]);
        }
      }
    }
    
    public static int bhO()
    {
      GMTrace.i(8145673912320L, 60690);
      if (qeu != -1)
      {
        i = qeu;
        GMTrace.o(8145673912320L, 60690);
        return i;
      }
      int i = com.tencent.mm.plugin.sns.data.i.bge();
      qeu = i;
      GMTrace.o(8145673912320L, 60690);
      return i;
    }
    
    public final void FU(String paramString)
    {
      GMTrace.i(8146747654144L, 60698);
      String str1 = ae.getAccSnsPath();
      String str2 = paramString + "bg_";
      String str3 = paramString + "tbg_";
      if (FileOp.aZ(str2))
      {
        FileOp.deleteFile(am.dt(str1, paramString) + str3);
        FileOp.g(am.dt(str1, paramString), str2, str3);
      }
      GMTrace.o(8146747654144L, 60698);
    }
    
    public final int GH(String paramString)
    {
      GMTrace.i(8145271259136L, 60687);
      synchronized (this.qew)
      {
        if (this.qew.containsKey(paramString))
        {
          i = ((Integer)this.qew.get(paramString)).intValue();
          if (i > 0) {}
          for (;;)
          {
            GMTrace.o(8145271259136L, 60687);
            return i;
            i = com.tencent.mm.plugin.sns.data.i.bgf();
          }
        }
        int i = com.tencent.mm.plugin.sns.data.i.bgf();
        GMTrace.o(8145271259136L, 60687);
        return i;
      }
    }
    
    public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
    {
      GMTrace.i(8145808130048L, 60691);
      w.i("MicroMsg.SnsService", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString + " type = " + paramk.getType());
      int i;
      if (((paramInt1 != 4) || (paramInt2 != 207)) && ((paramInt1 != 4) || (paramInt2 != 203))) {
        if ((paramInt1 == 4) && ((paramInt2 == 2001) || (paramInt2 == 2004))) {
          i = 1;
        }
      }
      while (i == 0)
      {
        GMTrace.o(8145808130048L, 60691);
        return;
        if ((paramInt1 == 4) && ((paramInt2 == 2001) || (paramInt2 == 2003))) {
          i = 1;
        } else if ((paramInt1 != 0) || (paramInt2 != 0)) {
          i = 0;
        } else {
          i = 1;
        }
      }
      switch (paramk.getType())
      {
      default: 
        if ((paramk.getType() == 212) || (paramk.getType() == 211))
        {
          paramk = (d)paramk;
          ??? = new ArrayList(this.hmO.keySet()).iterator();
        }
        break;
      case 212: 
      case 211: 
        label250:
        while (((Iterator)???).hasNext())
        {
          h.a locala = (h.a)((Iterator)???).next();
          if (this.hmO.containsKey(locala))
          {
            paramString = (String)this.hmO.get(locala);
            if (paramk.getUserName().equals(paramString))
            {
              w.d("MicroMsg.SnsService", "notify ui " + paramString);
              label353:
              boolean bool4;
              if (paramk.bgA() == 0L)
              {
                paramString = "";
                if (!paramk.bgw()) {
                  break label622;
                }
                bool2 = paramk.bgy();
                bool3 = paramk.bgx();
                bool4 = paramk.bgB();
                if ((paramInt1 != 4) || ((paramInt2 != 2001) && (paramInt2 != 2004) && (paramInt2 != 2003))) {
                  break label616;
                }
              }
              label616:
              for (boolean bool1 = true;; bool1 = false)
              {
                locala.a(bool2, bool3, paramString, bool4, bool1, paramInt2, paramk.bgC());
                break label250;
                ??? = (z)paramk;
                paramString = ((z)???).userName;
                long l = ((z)???).qbi;
                i = ((z)???).qbk;
                if (i > 0) {}
                synchronized (this.qew)
                {
                  this.qew.put(paramString, Integer.valueOf(i));
                  if (l == 0L) {
                    break;
                  }
                  synchronized (this.qev)
                  {
                    this.qev.put(paramString, Long.valueOf(l));
                  }
                }
                paramString = (x)paramk;
                w(paramString.qbi, paramString.qbk);
                i = paramString.qbl;
                if (qeu != i) {
                  com.tencent.mm.plugin.sns.data.i.tR(i);
                }
                qeu = i;
                break;
                paramString = com.tencent.mm.plugin.sns.data.i.dp(paramk.bgA());
                break label353;
              }
              label622:
              boolean bool2 = paramk.bgx();
              boolean bool3 = paramk.bgz();
              if ((paramInt1 == 4) && ((paramInt2 == 2001) || (paramInt2 == 2004) || (paramInt2 == 2003))) {}
              for (bool1 = true;; bool1 = false)
              {
                locala.a(bool2, paramString, bool3, bool1, paramInt2, paramk.bgC());
                break;
              }
            }
          }
        }
      }
      GMTrace.o(8145808130048L, 60691);
    }
    
    public final void a(int paramInt, String paramString, h.a arg3)
    {
      GMTrace.i(18586336755712L, 138479);
      w.i("MicroMsg.SnsService", "startServer " + paramInt + " " + ???);
      ae.bho().gCs = com.tencent.mm.x.m.zF();
      ae.bho().bgQ();
      ae.bhl().bgd();
      if (this.hmO.isEmpty())
      {
        com.tencent.mm.kernel.h.xA();
        com.tencent.mm.kernel.h.xy().gQO.a(211, this);
        com.tencent.mm.kernel.h.xA();
        com.tencent.mm.kernel.h.xy().gQO.a(212, this);
      }
      if (!this.hmO.containsKey(???))
      {
        if (paramInt == 1) {
          this.hmO.put(???, "@__weixintimtline");
        }
      }
      else {
        switch (paramInt)
        {
        }
      }
      for (;;)
      {
        GMTrace.o(18586336755712L, 138479);
        return;
        if ((paramInt == 2) || (paramInt == 3))
        {
          this.hmO.put(???, paramString);
          break;
        }
        if (paramInt == 4)
        {
          this.hmO.put(???, "@__classify_timeline");
          break;
        }
        if (paramInt == 5)
        {
          this.hmO.put(???, "");
          break;
        }
        this.hmO.put(???, "");
        break;
        synchronized (this.qev)
        {
          this.qev.put(paramString, Long.valueOf(0L));
        }
        synchronized (this.qew)
        {
          if (!this.qew.containsKey(paramString)) {
            this.qew.put(paramString, Integer.valueOf(bhN()));
          }
          z.Gy(paramString);
          this.qez.add(paramString);
          GMTrace.o(18586336755712L, 138479);
          return;
          paramString = finally;
          throw paramString;
        }
        this.qey = 0L;
        this.qex = bhN();
        x.Gv("@__weixintimtline");
      }
    }
    
    public final void a(int paramInt1, String paramString, boolean paramBoolean, int paramInt2)
    {
      GMTrace.i(8145137041408L, 60686);
      if (r.ibV)
      {
        GMTrace.o(8145137041408L, 60686);
        return;
      }
      w.d("MicroMsg.SnsService", "doFpList type: %s, objectId: %s", new Object[] { Integer.valueOf(paramInt1), paramString });
      if (paramInt1 == 2)
      {
        if (!z.Gx(paramString))
        {
          GMTrace.o(8145137041408L, 60686);
          return;
        }
        com.tencent.mm.kernel.h.xA();
        com.tencent.mm.kernel.h.xy().gQO.a(new z(paramString, 0L, paramBoolean, paramInt2), 0);
        GMTrace.o(8145137041408L, 60686);
        return;
      }
      if (paramInt1 == 1)
      {
        if (!x.Gu("@__weixintimtline"))
        {
          GMTrace.o(8145137041408L, 60686);
          return;
        }
        com.tencent.mm.kernel.h.xA();
        com.tencent.mm.kernel.h.xz().xi().set(68377, "");
        com.tencent.mm.kernel.h.xA();
        com.tencent.mm.kernel.h.xy().gQO.a(new x(0L), 0);
        GMTrace.o(8145137041408L, 60686);
        return;
      }
      if ((paramInt1 != 3) && (paramInt1 == 4))
      {
        if (!m.Gu("@__classify_timeline"))
        {
          GMTrace.o(8145137041408L, 60686);
          return;
        }
        com.tencent.mm.kernel.h.xA();
        com.tencent.mm.kernel.h.xy().gQO.a(new m(""), 0);
      }
      GMTrace.o(8145137041408L, 60686);
    }
    
    public final boolean a(h.a parama, int paramInt)
    {
      GMTrace.i(18586470973440L, 138480);
      w.d("MicroMsg.SnsService", "closeServer");
      this.hmO.remove(parama);
      if ((paramInt == 2) && (this.qez.size() > 0)) {
        this.qez.removeLast();
      }
      if (this.hmO.isEmpty())
      {
        com.tencent.mm.kernel.h.xA();
        com.tencent.mm.kernel.h.xy().gQO.b(211, this);
        com.tencent.mm.kernel.h.xA();
        com.tencent.mm.kernel.h.xy().gQO.b(212, this);
        am.release();
        com.tencent.mm.plugin.sns.storage.m.release();
        new com.tencent.mm.sdk.platformtools.ae(Looper.getMainLooper()).postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(8047158099968L, 59956);
            al.a locala = al.a.this;
            if ((!ae.bgY()) && (locala.hmO.isEmpty()))
            {
              ae.bhm().bgE();
              w.d("MicroMsg.SnsService", "clean sns cache");
            }
            GMTrace.o(8047158099968L, 59956);
          }
        }, 5000L);
        ai.bhH();
        w.i("MicroMsg.SnsService", "close finish");
      }
      GMTrace.o(18586470973440L, 138480);
      return true;
    }
    
    public final void b(int paramInt1, String paramString, boolean paramBoolean, int paramInt2)
    {
      GMTrace.i(8145002823680L, 60685);
      if (r.ibV)
      {
        GMTrace.o(8145002823680L, 60685);
        return;
      }
      synchronized (this.qev)
      {
        w.d("MicroMsg.SnsService", "DO NP　NP ~_~ %s type %s timeLastId: %s userLastIds: %s", new Object[] { paramString, Integer.valueOf(paramInt1), Long.valueOf(this.qey), this.qev });
        if (paramInt1 != 2) {
          break label218;
        }
        if (!z.Gx(paramString))
        {
          GMTrace.o(8145002823680L, 60685);
          return;
        }
      }
      long l = 0L;
      synchronized (this.qev)
      {
        if (this.qev.containsKey(paramString)) {
          l = ((Long)this.qev.get(paramString)).longValue();
        }
        if (l == 0L)
        {
          x.Gv(paramString);
          GMTrace.o(8145002823680L, 60685);
          return;
        }
      }
      com.tencent.mm.kernel.h.xA();
      com.tencent.mm.kernel.h.xy().gQO.a(new z(paramString, l, paramBoolean, paramInt2), 0);
      GMTrace.o(8145002823680L, 60685);
      return;
      label218:
      if (paramInt1 == 1)
      {
        if (!x.Gu("@__weixintimtline"))
        {
          GMTrace.o(8145002823680L, 60685);
          return;
        }
        if (this.qey == 0L)
        {
          x.Gv("@__weixintimtline");
          GMTrace.o(8145002823680L, 60685);
          return;
        }
        com.tencent.mm.kernel.h.xA();
        com.tencent.mm.kernel.h.xy().gQO.a(new x(this.qey), 0);
        GMTrace.o(8145002823680L, 60685);
        return;
      }
      if ((paramInt1 != 3) && (paramInt1 == 4))
      {
        if (!m.Gu("@__classify_timeline"))
        {
          GMTrace.o(8145002823680L, 60685);
          return;
        }
        if (this.qey == 0L)
        {
          m.Gv("@__classify_timeline");
          GMTrace.o(8145002823680L, 60685);
          return;
        }
        com.tencent.mm.kernel.h.xA();
        com.tencent.mm.kernel.h.xy().gQO.a(new m(""), 0);
      }
      GMTrace.o(8145002823680L, 60685);
    }
    
    public final int bhN()
    {
      GMTrace.i(8145405476864L, 60688);
      if (this.qex > 0)
      {
        i = this.qex;
        GMTrace.o(8145405476864L, 60688);
        return i;
      }
      int i = com.tencent.mm.plugin.sns.data.i.bgf();
      GMTrace.o(8145405476864L, 60688);
      return i;
    }
    
    public final Intent f(Intent paramIntent, String paramString)
    {
      GMTrace.i(8144600170496L, 60682);
      paramIntent.putExtra("sns_userName", paramString);
      if ((this.qez != null) && (this.qez.contains(paramString)))
      {
        paramIntent.addFlags(536870912);
        paramIntent.addFlags(67108864);
        GMTrace.o(8144600170496L, 60682);
        return paramIntent;
      }
      GMTrace.o(8144600170496L, 60682);
      return paramIntent;
    }
    
    public final void f(String paramString, ArrayList<com.tencent.mm.plugin.sns.g.b> paramArrayList)
    {
      GMTrace.i(8144465952768L, 60681);
      this.qeA.put(paramString, paramArrayList);
      GMTrace.o(8144465952768L, 60681);
    }
    
    public final void w(long paramLong, int paramInt)
    {
      GMTrace.i(8145539694592L, 60689);
      w.d("MicroMsg.SnsService", "setTimeLastId %d", new Object[] { Long.valueOf(paramLong) });
      if (paramInt > 0)
      {
        this.qex = paramInt;
        com.tencent.mm.plugin.sns.data.i.tS(paramInt);
      }
      if (paramLong == 0L)
      {
        GMTrace.o(8145539694592L, 60689);
        return;
      }
      this.qey = paramLong;
      GMTrace.o(8145539694592L, 60689);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */