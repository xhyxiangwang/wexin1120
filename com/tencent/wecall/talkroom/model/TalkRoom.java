package com.tencent.wecall.talkroom.model;

import android.text.TextUtils;
import com.google.a.a.e;
import com.tencent.pb.b.a.a;
import com.tencent.pb.common.b.a.a.aq;
import com.tencent.pb.common.b.a.a.as;
import com.tencent.pb.common.b.a.a.at;
import com.tencent.pb.common.b.a.a.r;
import com.tencent.pb.common.c.c;
import com.tencent.pb.talkroom.sdk.MultiTalkGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class TalkRoom
  extends MultiTalkGroup
{
  a.aq xLG;
  Map<String, d> xLH = new ConcurrentHashMap();
  
  public TalkRoom(String paramString, Integer paramInteger, a.aq paramaq)
  {
    c(paramString, paramInteger);
    b(paramaq);
  }
  
  private static void Fy(int paramInt)
  {
    c.d("tagorewang:TalkRoom", new Object[] { "setRoomId: ", Integer.valueOf(paramInt) });
  }
  
  private void XU(String paramString)
  {
    if (j.Yi(paramString)) {
      this.xrj = paramString;
    }
  }
  
  private static a.r a(a.aq paramaq)
  {
    if (paramaq != null) {
      try
      {
        if (paramaq.xpQ != null)
        {
          paramaq = paramaq.xpQ;
          paramaq = (a.r)e.a(new a.r(), paramaq, paramaq.length);
          return paramaq;
        }
      }
      catch (Exception paramaq)
      {
        c.k("tagorewang:TalkRoom", new Object[] { "toPlayItemInfo err: ", paramaq });
        return null;
      }
    }
    return null;
  }
  
  public static TalkRoom a(TalkRoom paramTalkRoom, String paramString1, String paramString2, Integer paramInteger, int paramInt, long paramLong, a.aq paramaq, a.as[] paramArrayOfas, a.at[] paramArrayOfat)
  {
    if (paramTalkRoom == null)
    {
      c.k("tagorewang:TalkRoom:update", new Object[] { "updateAll null" });
      return null;
    }
    c.d("tagorewang:TalkRoom:update", new Object[] { "updateAll groupId: ", paramString1, " tmpId: ", paramString2 });
    paramTalkRoom.c(paramString1, paramInteger);
    paramTalkRoom.XU(paramString2);
    Fy(paramInt);
    fq(paramLong);
    paramTalkRoom.b(paramaq);
    if (paramArrayOfas == null)
    {
      paramInt = 0;
      if (paramArrayOfat != null) {
        break label124;
      }
    }
    label124:
    for (int i = 0;; i = paramArrayOfat.length)
    {
      if ((paramInt != 0) || (i != 0)) {
        break label132;
      }
      c.k("tagorewang:TalkRoom:update", new Object[] { "updateAll null VoiceGroupMem or VoiceGroupUsrProfile array." });
      return paramTalkRoom;
      paramInt = paramArrayOfas.length;
      break;
    }
    label132:
    paramString2 = new HashSet(paramTalkRoom.xLH.keySet());
    paramString2.remove(a.cjV());
    i = 0;
    while (i != paramInt)
    {
      paramInteger = paramArrayOfas[i];
      if (paramInteger == null)
      {
        c.k("tagorewang:TalkRoom:update", new Object[] { "null member info, index: ", Integer.valueOf(i) });
        i += 1;
      }
      else
      {
        paramString1 = paramTalkRoom.XV(paramInteger.xps);
        if (paramString1 == null)
        {
          c.d("tagorewang:TalkRoom:update", new Object[] { "add new member" });
          paramString1 = new d(paramInteger);
          paramTalkRoom.a(paramString1);
        }
        for (;;)
        {
          paramString2.remove(paramString1.cob());
          break;
          paramString1.a(paramInteger);
        }
      }
    }
    paramString1 = paramString2.iterator();
    while (paramString1.hasNext())
    {
      paramInteger = (String)paramString1.next();
      c.d("tagorewang:TalkRoom:update", new Object[] { "keyset", paramInteger });
      c.d("tagorewang:TalkRoom", new Object[] { "remove", paramTalkRoom.xLH.remove(paramInteger) });
    }
    if (paramString2.size() > 0) {
      c.k("tagorewang:TalkRoom:update", new Object[] { "updateAll not update uuid keyset.size(): ", Integer.valueOf(paramString2.size()) });
    }
    c.d("tagorewang:TalkRoom:update", new Object[] { "did updateAll" });
    return paramTalkRoom;
  }
  
  public static TalkRoom a(String paramString1, String paramString2, Integer paramInteger, int paramInt, long paramLong, a.aq paramaq, a.as[] paramArrayOfas, a.at[] paramArrayOfat)
  {
    c.d("tagorewang:TalkRoom:create", new Object[] { "create groupId: ", paramString1, " tmpId: ", paramString2 });
    paramInteger = new TalkRoom(paramString1, paramInteger, paramaq);
    paramInteger.XU(paramString2);
    Fy(paramInt);
    fq(paramLong);
    if (paramArrayOfas == null)
    {
      paramInt = 0;
      if (paramArrayOfat != null) {
        break label125;
      }
    }
    label125:
    for (int i = 0;; i = paramArrayOfat.length)
    {
      int j = 0;
      for (;;)
      {
        if (j == paramInt) {
          break label218;
        }
        paramString2 = paramArrayOfas[j];
        if (paramString2 != null) {
          break;
        }
        c.k("tagorewang:TalkRoom:create", new Object[] { "null member info, index: ", Integer.valueOf(j) });
        j += 1;
      }
      paramInt = paramArrayOfas.length;
      break;
    }
    int k = 0;
    for (;;)
    {
      paramString1 = null;
      if (k != i)
      {
        paramString1 = paramArrayOfat[k];
        if ((paramString1 != null) && (paramString1.trb == paramString2.trb)) {
          c.d("tagorewang:TalkRoom:create", new Object[] { "member info: ", paramString2, " profile: ", paramString1 });
        }
      }
      else
      {
        paramInteger.a(new d(paramString2, paramString1));
        break;
      }
      k += 1;
    }
    label218:
    c.d("tagorewang:TalkRoom:create", new Object[] { "did create" });
    return paramInteger;
  }
  
  private void b(a.aq paramaq)
  {
    if (paramaq == null) {
      return;
    }
    for (;;)
    {
      a.r localr2;
      try
      {
        this.xrk = paramaq.xpX;
        this.xrl = paramaq.xpW;
        if ((this.xLG != null) && (paramaq.fBu != 0))
        {
          a.r localr1 = a(paramaq);
          localr2 = a(this.xLG);
          if (localr1 == null) {
            paramaq.xpQ = this.xLG.xpQ;
          }
        }
        else
        {
          this.xLG = paramaq;
          return;
        }
      }
      catch (Exception localException)
      {
        c.k("tagorewang:TalkRoom", new Object[] { "setRoomInfo assert failed: ", localException });
        this.xLG = paramaq;
        return;
      }
      if ((localException.xoI == 0) || (localException.xoI != localr2.xoI))
      {
        c.k("tagorewang:TalkRoom", new Object[] { "setRoomInfo bad id: ", Integer.valueOf(localr2.xoI), " -> ", Integer.valueOf(localException.xoI) });
        paramaq.xpQ = this.xLG.xpQ;
      }
    }
  }
  
  public static long bsR()
  {
    return j.cox();
  }
  
  private void c(String paramString, Integer paramInteger)
  {
    if (TextUtils.isEmpty(paramString)) {}
    for (;;)
    {
      return;
      if (j.Yi(paramString)) {
        this.xrj = paramString;
      }
      while (paramInteger != null)
      {
        this.xnh = paramInteger.intValue();
        return;
        this.xri = paramString;
      }
    }
  }
  
  public static boolean cnP()
  {
    return false;
  }
  
  public static int cnR()
  {
    return j.cow();
  }
  
  private String cnS()
  {
    if ((this.xLG == null) || (TextUtils.isEmpty(this.xLG.name)))
    {
      Object localObject1 = new ArrayList(this.xLH.values());
      Object localObject2 = a.cjV();
      ((List)localObject1).remove(this.xLH.get(localObject2));
      localObject1 = dd((List)localObject1);
      c.j("tagorewang:TalkRoom", new Object[] { "getOtherMembers size: ", Integer.valueOf(((List)localObject1).size()), " all size: ", Integer.valueOf(this.xLH.size()) });
      localObject2 = new StringBuilder();
      if (localObject1 != null)
      {
        int j = ((List)localObject1).size();
        int i = 0;
        while (i != j)
        {
          try
          {
            ((StringBuilder)localObject2).append(((d)((List)localObject1).get(i)).getDisplayName());
            if (i != j - 1) {
              ((StringBuilder)localObject2).append('、');
            }
          }
          catch (Exception localException)
          {
            for (;;)
            {
              c.k("tagorewang:TalkRoom", new Object[] { "updateRoomNameIfEmpty err and continue: ", localException });
            }
          }
          i += 1;
        }
      }
      if (((StringBuilder)localObject2).toString().length() > 0) {
        return ((StringBuilder)localObject2).toString();
      }
    }
    if ((this.xLG != null) && (!TextUtils.isEmpty(this.xLG.name))) {
      return this.xLG.name;
    }
    c.k("tagorewang:TalkRoom", new Object[] { "updateRoomNameIfEmpty still empty, groupId: ", this.xri, " tmpId: ", this.xrj });
    return null;
  }
  
  private static List<d> dd(List<d> paramList)
  {
    if (paramList.isEmpty()) {
      return paramList;
    }
    Collections.sort(paramList, new a());
    return paramList;
  }
  
  private static void fq(long paramLong)
  {
    c.d("tagorewang:TalkRoom", new Object[] { "setRoomKey: ", Long.valueOf(paramLong) });
  }
  
  public final d XV(String paramString)
  {
    return (d)this.xLH.get(paramString);
  }
  
  public final void a(d paramd)
  {
    this.xLH.put(paramd.cob(), paramd);
  }
  
  public final int cnQ()
  {
    if (this.xnh == 0) {
      return 0;
    }
    return this.xnh;
  }
  
  public final List<d> cnT()
  {
    List localList = dd(new ArrayList(this.xLH.values()));
    d locald = cnV();
    localList.remove(locald);
    localList.add(0, locald);
    locald = (d)this.xLH.get(Integer.valueOf(90100));
    if (locald != null)
    {
      localList.remove(locald);
      localList.add(locald);
    }
    return localList;
  }
  
  public final List<d> cnU()
  {
    return new ArrayList(this.xLH.values());
  }
  
  public final d cnV()
  {
    return (d)this.xLH.get(a.cjV());
  }
  
  public final List<a.as> cnW()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.xLH.entrySet().iterator();
    while (localIterator.hasNext()) {
      localArrayList.add(((d)((Map.Entry)localIterator.next()).getValue()).xLO);
    }
    return localArrayList;
  }
  
  public String toString()
  {
    localStringBuilder1 = new StringBuilder();
    for (;;)
    {
      try
      {
        localStringBuilder1.append("groupId: ").append(this.xri);
        localStringBuilder1.append(" tmpId: ").append(this.xrj);
        localStringBuilder1.append(" routeId: ").append(this.xnh);
        StringBuilder localStringBuilder2 = localStringBuilder1.append(" room name: ");
        if ((this.xLG != null) && (!TextUtils.isEmpty(this.xLG.name))) {
          continue;
        }
        str = cnS();
        localStringBuilder2.append(str);
      }
      catch (Exception localException)
      {
        String str;
        localStringBuilder1.append(" broken by " + localException.getMessage());
        continue;
      }
      return localStringBuilder1.toString();
      str = this.xLG.name;
    }
  }
  
  static final class a
    implements Comparator<d>
  {}
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/wecall/talkroom/model/TalkRoom.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */