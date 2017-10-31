package com.tencent.wecall.talkroom.model;

import android.text.TextUtils;
import com.tencent.pb.b.a.a;
import com.tencent.pb.common.b.a.a.aq;
import com.tencent.pb.common.b.a.a.as;
import com.tencent.pb.common.b.a.a.at;
import com.tencent.pb.common.c.f;
import com.tencent.pb.talkroom.sdk.MultiTalkGroup;
import com.tencent.pb.talkroom.sdk.MultiTalkGroupMember;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class c
{
  private static boolean DEBUG = false;
  public static boolean xLJ = false;
  private static final f<c> xLK = new f() {};
  Map<String, TalkRoom> xLL = new HashMap();
  Map<String, String> xLM = new HashMap();
  g xLN;
  
  public c()
  {
    com.tencent.pb.common.c.c.d("TalkRoomManager", new Object[] { "asyncLoadCache" });
  }
  
  public static boolean XZ(String paramString)
  {
    paramString = cnZ().XW(paramString);
    if (paramString == null) {
      com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "isMySelfExit talkRoom is null" });
    }
    do
    {
      return true;
      paramString = paramString.cnV();
    } while ((paramString == null) || (20 == paramString.getState()));
    return false;
  }
  
  public static int Ya(String paramString)
  {
    Object localObject = cnZ().XW(paramString);
    if (localObject == null)
    {
      com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "getMySelfReason talkRoom is null groupId: ", paramString });
      return 0;
    }
    localObject = ((TalkRoom)localObject).cnV();
    if ((localObject != null) && (((d)localObject).xLO != null)) {}
    for (int i = ((d)localObject).xLO.fFs;; i = 0)
    {
      com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "getMySelfReason groupId: ", paramString, " reason: ", Integer.valueOf(i) });
      return i;
    }
  }
  
  public static c cnZ()
  {
    return (c)xLK.get();
  }
  
  static void coa()
  {
    com.tencent.pb.common.c.c.d("TalkRoomManager", new Object[] { "asyncWriteBackCache" });
  }
  
  public final TalkRoom XW(String paramString)
  {
    TalkRoom localTalkRoom2 = (TalkRoom)this.xLL.get(paramString);
    TalkRoom localTalkRoom1 = localTalkRoom2;
    if (localTalkRoom2 == null)
    {
      localTalkRoom1 = localTalkRoom2;
      if (j.Yi(paramString))
      {
        paramString = (String)this.xLM.get(paramString);
        localTalkRoom1 = (TalkRoom)this.xLL.get(paramString);
      }
    }
    return localTalkRoom1;
  }
  
  public final int XX(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
    {
      com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "getSelfMemberId invalid groupId" });
      return -1;
    }
    Object localObject = XW(paramString);
    if (localObject == null)
    {
      com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "getSelfMemberId TalkRoom is null  groupId: ", paramString });
      return -1;
    }
    localObject = ((TalkRoom)localObject).XV(a.cjV());
    if (localObject != null)
    {
      com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "getSelfMemberId TalkRoomMember is not null groupId: ", paramString, " uuid: ", a.cjV(), " memberId: ", Integer.valueOf(((d)localObject).coc()) });
      return ((d)localObject).coc();
    }
    com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "getSelfMemberId TalkRoomMember is null" });
    return -1;
  }
  
  public final int XY(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
    {
      com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "getRountIdByGrouId invalid groupId" });
      return 0;
    }
    TalkRoom localTalkRoom = XW(paramString);
    if (localTalkRoom == null)
    {
      com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "getRountIdByGrouId TalkRoom is null  groupId: ", paramString });
      return 0;
    }
    return localTalkRoom.cnQ();
  }
  
  public final MultiTalkGroup Yb(String paramString)
  {
    paramString = XW(paramString);
    if (paramString == null) {
      return null;
    }
    MultiTalkGroup localMultiTalkGroup = new MultiTalkGroup();
    localMultiTalkGroup.xri = paramString.xri;
    localMultiTalkGroup.xrj = paramString.xrj;
    localMultiTalkGroup.xnh = paramString.xnh;
    localMultiTalkGroup.xrk = paramString.xrk;
    localMultiTalkGroup.xrl = paramString.xrl;
    ArrayList localArrayList = new ArrayList();
    paramString = paramString.cnU();
    if (paramString.size() > 0)
    {
      Iterator localIterator = paramString.iterator();
      while (localIterator.hasNext())
      {
        d locald = (d)localIterator.next();
        if (locald != null)
        {
          MultiTalkGroupMember localMultiTalkGroupMember = new MultiTalkGroupMember();
          localMultiTalkGroupMember.xrn = locald.cob();
          if (locald.xLO != null)
          {
            paramString = locald.xLO.xqy;
            label154:
            localMultiTalkGroupMember.xro = paramString;
            if (locald.xLO == null) {
              break label246;
            }
            i = locald.xLO.fFs;
            label177:
            localMultiTalkGroupMember.fFs = i;
            localMultiTalkGroupMember.status = locald.getState();
            if ((locald.xLO == null) || (locald.xLO.xqm == 0)) {
              break label251;
            }
          }
          label246:
          label251:
          for (int i = locald.xLO.xqm;; i = 0)
          {
            localMultiTalkGroupMember.xqm = i;
            localArrayList.add(localMultiTalkGroupMember);
            break;
            paramString = "";
            break label154;
            i = 0;
            break label177;
          }
        }
      }
    }
    localMultiTalkGroup.xrm = localArrayList;
    return localMultiTalkGroup;
  }
  
  public final boolean a(String paramString1, String paramString2, int paramInt1, int paramInt2, String... paramVarArgs)
  {
    com.tencent.pb.common.c.c.d("TalkRoomManager", new Object[] { "newTmpGroup groupId: ", paramString1 });
    if (!j.Yi(paramString1))
    {
      com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "newTmpGroup invalid clientGroupId" });
      return false;
    }
    if ((paramVarArgs == null) || (paramVarArgs.length == 0))
    {
      com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "newTmpGroup empty uuid array" });
      return false;
    }
    try
    {
      Object localObject = new a.aq();
      ((a.aq)localObject).fBu = 0;
      ((a.aq)localObject).xpX = paramString2;
      ((a.aq)localObject).xpW = a.cjV();
      paramString2 = new TalkRoom(paramString1, null, (a.aq)localObject);
      paramInt2 = paramVarArgs.length;
      paramInt1 = 0;
      while (paramInt1 != paramInt2)
      {
        localObject = paramVarArgs[paramInt1];
        a.as localas = new a.as();
        localas.xps = ((String)localObject);
        localas.xqy = a.cjV();
        localas.status = 20;
        localas.mXM = -1;
        localas.xqm = ((int)(System.currentTimeMillis() / 1000L));
        paramString2.a(new d(localas, new a.at()));
        paramInt1 += 1;
      }
      this.xLL.put(paramString1, paramString2);
      coa();
      return true;
    }
    catch (Exception paramString1)
    {
      com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "newTmpGroup err: ", paramString1 });
    }
    return false;
  }
  
  public final boolean bi(String paramString, boolean paramBoolean)
  {
    if (TextUtils.isEmpty(paramString))
    {
      com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "isGroupActiveExceptMySelf groupid is null" });
      return false;
    }
    paramString = XW(paramString);
    if (paramString == null)
    {
      com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "isGroupActiveExceptMySelf talkRoom is null" });
      return false;
    }
    paramString = paramString.cnT();
    if (paramString == null)
    {
      com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "isGroupActiveExceptMySelf TalkRoomMember list is null" });
      return false;
    }
    paramString = paramString.iterator();
    int j = 0;
    int i = 0;
    label89:
    int k;
    for (;;)
    {
      if (paramString.hasNext())
      {
        d locald = (d)paramString.next();
        if (locald != null)
        {
          TalkRoom.cnP();
          if (locald.getState() != 10) {
            break label204;
          }
          if (locald.cod())
          {
            k = 1;
            j = i;
            i = k;
          }
        }
      }
    }
    for (;;)
    {
      if ((paramBoolean) && (j != 0))
      {
        return true;
        i = j;
        j = 1;
      }
      else
      {
        if ((i != 0) && (j != 0))
        {
          com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "isGroupActiveExceptMySelf is true" });
          return true;
        }
        k = j;
        j = i;
        i = k;
        break label89;
        break;
        label204:
        k = i;
        i = j;
        j = k;
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/wecall/talkroom/model/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */