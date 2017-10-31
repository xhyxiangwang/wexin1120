package com.tencent.wecall.talkroom.model;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.widget.Toast;
import com.tencent.mm.plugin.multi.talk;
import com.tencent.pb.common.b.a.a.aj;
import com.tencent.pb.common.b.a.a.as;
import com.tencent.pb.common.system.ConnectReceiver;
import com.tencent.pb.talkroom.sdk.MultiTalkGroup;
import com.tencent.pb.talkroom.sdk.g;
import com.tencent.wecall.talkroom.a.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class e
  implements com.tencent.pb.talkroom.sdk.d
{
  private static e xLR = null;
  private final String TAG = "TalkRoomSdkApi";
  public com.tencent.pb.talkroom.sdk.a xLQ = null;
  private ConnectReceiver xLS = new ConnectReceiver();
  private g.a xLT = new g.a()
  {
    public final void FA(int paramAnonymousInt)
    {
      com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "onSwitchMultiTalkVideoSuss bitRate: ", Integer.valueOf(paramAnonymousInt) });
      if (e.this.xLQ != null) {
        e.this.xLQ.aQn();
      }
    }
    
    public final void Fz(int paramAnonymousInt)
    {
      com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "onOpeningChannel", Integer.valueOf(paramAnonymousInt) });
    }
    
    public final void a(int paramAnonymousInt, MultiTalkGroup paramAnonymousMultiTalkGroup)
    {
      com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "onMisscMultiTalk", paramAnonymousMultiTalkGroup, " time: ", Integer.valueOf(paramAnonymousInt) });
      if (e.this.xLQ != null)
      {
        e.this.xLQ.d(paramAnonymousMultiTalkGroup);
        if (com.tencent.pb.common.a.a.xmG) {
          Toast.makeText(com.tencent.pb.common.c.d.rwf, "onMisscMultiTalk " + paramAnonymousMultiTalkGroup, 0).show();
        }
      }
    }
    
    public final void aJU()
    {
      com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "onInitSeccess" });
      if (com.tencent.pb.common.a.a.xmG) {
        Toast.makeText(com.tencent.pb.common.c.d.rwf, "onInitSeccess ", 0).show();
      }
      if (e.this.xLQ != null) {
        e.this.xLQ.aQm();
      }
    }
    
    public final void aT(List<a.aj> paramAnonymousList)
    {
      com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "onVideoGroupMemberChange videoUserNames: ", paramAnonymousList });
      if (e.this.xLQ != null) {
        e.this.xLQ.aT(paramAnonymousList);
      }
    }
    
    public final void b(MultiTalkGroup paramAnonymousMultiTalkGroup)
    {
      com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "onInviteMultiTalk", paramAnonymousMultiTalkGroup });
      if (e.this.xLQ != null)
      {
        e.this.xLQ.b(paramAnonymousMultiTalkGroup);
        if (com.tencent.pb.common.a.a.xmG) {
          Toast.makeText(com.tencent.pb.common.c.d.rwf, "onInviteMultiTalk " + paramAnonymousMultiTalkGroup, 0).show();
        }
      }
    }
    
    public final void bj(String paramAnonymousString, boolean paramAnonymousBoolean)
    {
      com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "onExitRoom", paramAnonymousString, a.cnN().mHz, Boolean.valueOf(paramAnonymousBoolean) });
    }
    
    public final void cof()
    {
      com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "onSelfHoldOnBegin" });
    }
    
    public final void cog()
    {
      com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "onSelfHoldOnEnd" });
    }
    
    public final void coh()
    {
      com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "onSendMsgSucc" });
    }
    
    public final void de(List<MultiTalkGroup> paramAnonymousList)
    {
      com.tencent.pb.common.c.c.j("TalkRoomSdkApi", new Object[] { "onActiveMultiTalkList ", paramAnonymousList });
    }
    
    public final void ds(String paramAnonymousString, int paramAnonymousInt)
    {
      com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "onModifyGroupInfo", paramAnonymousString, Integer.valueOf(paramAnonymousInt) });
    }
    
    public final void e(int paramAnonymousInt, Object paramAnonymousObject)
    {
      com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "onErr errCode: ", Integer.valueOf(paramAnonymousInt), " data: ", paramAnonymousObject });
      if (e.this.xLQ != null) {
        e.this.xLQ.e(paramAnonymousInt, paramAnonymousObject);
      }
    }
    
    public final void g(MultiTalkGroup paramAnonymousMultiTalkGroup)
    {
      Object localObject = a.cnN().mHz;
      String str = null;
      if (paramAnonymousMultiTalkGroup != null) {
        str = paramAnonymousMultiTalkGroup.xri;
      }
      com.tencent.pb.common.c.c.j("TalkRoomSdkApi", new Object[] { "onMemberChange mGroupId: ", localObject, " groupId: ", str, paramAnonymousMultiTalkGroup });
      if (com.tencent.pb.common.a.a.xmG) {
        Toast.makeText(com.tencent.pb.common.c.d.rwf, "onMemberChange " + paramAnonymousMultiTalkGroup, 0).show();
      }
      int k;
      int j;
      int i;
      if (com.tencent.pb.common.c.h.fi(str, (String)localObject))
      {
        c.cnZ();
        if ((c.XZ((String)localObject)) && (a.cnN().state != 3))
        {
          c.cnZ();
          k = c.Ya((String)localObject);
          if (k != 104) {
            break label276;
          }
          j = 63934;
          i = 325;
        }
      }
      for (;;)
      {
        com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "onMemberChange isMySelfExit finish ", "stopstatus", Integer.valueOf(j), Integer.valueOf(i), str, " reason: ", Integer.valueOf(k) });
        h.FC(j);
        a.cnN().xMp.FG(i);
        localObject = a.cnN();
        i = a.cnN().ndF;
        long l = a.cnN().xMh;
        boolean bool = a.cnN().rpz;
        ((f)localObject).a(str, i, l, false, false, false);
        if (e.this.xLQ != null) {
          e.this.xLQ.g(paramAnonymousMultiTalkGroup);
        }
        return;
        label276:
        if (k == 2)
        {
          j = 63933;
          i = 326;
        }
        else
        {
          j = 63932;
          i = 328;
        }
      }
    }
    
    public final void gg(boolean paramAnonymousBoolean)
    {
      com.tencent.pb.common.c.c.j("TalkRoomSdkApi", new Object[] { "onMuteStateChange", Boolean.valueOf(paramAnonymousBoolean) });
      if (e.this.xLQ != null) {
        e.this.xLQ.gg(paramAnonymousBoolean);
      }
    }
    
    public final void onStateChanged(int paramAnonymousInt)
    {
      com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "onStateChanged", Integer.valueOf(paramAnonymousInt) });
    }
    
    public final void p(MultiTalkGroup paramAnonymousMultiTalkGroup)
    {
      com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "onCreateRoom", paramAnonymousMultiTalkGroup });
      if (com.tencent.pb.common.a.a.xmG) {
        Toast.makeText(com.tencent.pb.common.c.d.rwf, "onCreateRoom " + paramAnonymousMultiTalkGroup, 0).show();
      }
      if (e.this.xLQ != null) {
        e.this.xLQ.e(paramAnonymousMultiTalkGroup);
      }
    }
    
    public final void q(MultiTalkGroup paramAnonymousMultiTalkGroup)
    {
      com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "onEnterRoom", paramAnonymousMultiTalkGroup });
      if (e.this.xLQ != null)
      {
        e.this.xLQ.f(paramAnonymousMultiTalkGroup);
        if (com.tencent.pb.common.a.a.xmG) {
          Toast.makeText(com.tencent.pb.common.c.d.rwf, "onEnterRoom " + paramAnonymousMultiTalkGroup, 0).show();
        }
      }
    }
    
    public final void y(String paramAnonymousString, byte[] paramAnonymousArrayOfByte)
    {
      int i = 0;
      if (paramAnonymousArrayOfByte == null) {}
      for (;;)
      {
        com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "onRcvMultiTalkMsg groupId: ", paramAnonymousString, " datas size: ", Integer.valueOf(i) });
        return;
        i = paramAnonymousArrayOfByte.length;
      }
    }
  };
  
  public static e coe()
  {
    if (xLR == null) {}
    try
    {
      if (xLR == null) {
        xLR = new e();
      }
      return xLR;
    }
    finally {}
  }
  
  public static void ik(Context paramContext)
  {
    com.tencent.pb.common.c.d.rwf = paramContext;
    com.tencent.e.i.ij(paramContext);
  }
  
  public final boolean Cs(String paramString)
  {
    if (!com.tencent.pb.common.c.h.fi(paramString, a.cnN().mHz))
    {
      com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "exitMultiTalk groupid is not same; multiTalkGroupid: ", paramString, a.cnN().mHz });
      f.e locale;
      f localf;
      if (a.cnN().Yd(paramString))
      {
        locale = a.cnN().Yc(paramString);
        localf = a.cnN();
        if (locale != null) {
          break label90;
        }
        i = 0;
        if (locale != null) {
          break label99;
        }
      }
      label90:
      label99:
      for (l = 0L;; l = locale.mXh)
      {
        localf.b(paramString, i, l, 1);
        return false;
        i = locale.mXg;
        break;
      }
    }
    int i = a.cnN().ndF;
    long l = a.cnN().xMh;
    boolean bool = a.cnN().Z(paramString, 1, 100);
    com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "exitMultiTalk groupId: ", paramString, " roomId: ", Integer.valueOf(i), " roomKey: ", Long.valueOf(l) });
    return bool;
  }
  
  public final int D(byte[] paramArrayOfByte, int paramInt)
  {
    f localf = a.cnN();
    if (localf.xMq == null) {
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "setAppCmd type: ", Integer.valueOf(10), " engine is null" });
    }
    for (int i = -1;; i = localf.xMq.xLI.setAppCmd(10, paramArrayOfByte, paramInt))
    {
      com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "setAppCmd type: ", Integer.valueOf(10), " paramLen: ", Integer.valueOf(paramInt), " ret: ", Integer.valueOf(i) });
      return i;
    }
  }
  
  public final List<String> WQ(String paramString)
  {
    if (!com.tencent.pb.common.c.h.fi(paramString, a.cnN().mHz))
    {
      com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "getTalkingMember groupid is not same; multiTalkGroupid: ", paramString, a.cnN().mHz });
      return null;
    }
    Object localObject1 = c.cnZ().XW(paramString);
    if (localObject1 == null)
    {
      com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "getTalkingMember talkroom is null: groupId: ", paramString });
      return null;
    }
    localObject1 = ((TalkRoom)localObject1).cnU();
    paramString = new ArrayList();
    localObject1 = ((List)localObject1).iterator();
    label192:
    label195:
    for (;;)
    {
      d locald;
      int i;
      if (((Iterator)localObject1).hasNext())
      {
        locald = (d)((Iterator)localObject1).next();
        if (locald == null) {
          continue;
        }
        Object localObject2 = a.cnN();
        i = locald.coc();
        if (((f)localObject2).xMq == null) {
          break label192;
        }
        localObject2 = ((f)localObject2).xMq;
        if ((com.tencent.pb.common.a.a.xmH) && (((b)localObject2).xLI.GetVoiceActivity(i) == 1)) {
          i = 1;
        }
      }
      for (;;)
      {
        if (i == 0) {
          break label195;
        }
        paramString.add(locald.cob());
        break;
        i = 0;
        continue;
        return paramString;
        i = 0;
      }
    }
  }
  
  public final int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, int paramInt14)
  {
    Object localObject = a.cnN().xMq;
    if (localObject == null)
    {
      com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "setMultiTalkAppCmd talkRoomContext is null" });
      return -100;
    }
    localObject = ((b)localObject).xLI;
    if (localObject == null)
    {
      com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "setMultiTalkAppCmd engine is null" });
      return -101;
    }
    com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "setMultiTalkAppCmd inputVolumeScale: ", Integer.valueOf(paramInt1), " inputVolumeScaleForSpeaker: ", Integer.valueOf(paramInt2), " outputVolumeScale: ", Integer.valueOf(paramInt3), " outputVolumeScaleForSpeaker: ", Integer.valueOf(paramInt4), " ehanceHeadsetEC: ", Integer.valueOf(paramInt5), " setECModeLevelForHeadSet: ", Integer.valueOf(paramInt6), " setECModeLevelForSpeaker: ", Integer.valueOf(paramInt7), " enableSpeakerEnhanceEC: ", Integer.valueOf(paramInt8), " aecMode: ", Integer.valueOf(paramInt9), " nsMode: ", Integer.valueOf(paramInt10), " agcMode: ", Integer.valueOf(paramInt11), " agctargetdb: ", Integer.valueOf(paramInt12), " agcgaindb: ", Integer.valueOf(paramInt13), " agcFlag: ", Integer.valueOf(paramInt14) });
    if (!com.tencent.pb.common.a.a.xmH) {
      return 65336;
    }
    byte[] arrayOfByte;
    if (com.tencent.pb.a.a.a.xkB)
    {
      arrayOfByte = new byte[2];
      byte[] tmp299_297 = arrayOfByte;
      tmp299_297[0] = 0;
      byte[] tmp305_299 = tmp299_297;
      tmp305_299[1] = 0;
      tmp305_299;
      arrayOfByte[1] = 2;
      arrayOfByte[0] = 2;
      ((talk)localObject).setAppCmd(414, arrayOfByte, 2);
      ((talk)localObject).setAppCmd(415, arrayOfByte, 2);
      ((talk)localObject).ct(419, 0);
      ((talk)localObject).ct(418, 4);
      if ((paramInt1 >= 0) || (paramInt2 >= 0))
      {
        arrayOfByte = new byte[2];
        byte[] tmp381_379 = arrayOfByte;
        tmp381_379[0] = 0;
        byte[] tmp387_381 = tmp381_379;
        tmp387_381[1] = 0;
        tmp387_381;
        if (paramInt1 >= 0) {
          arrayOfByte[0] = ((byte)paramInt1);
        }
        if (paramInt2 >= 0) {
          arrayOfByte[1] = ((byte)paramInt2);
        }
        ((talk)localObject).setAppCmd(414, arrayOfByte, 2);
      }
      if ((paramInt3 >= 0) || (paramInt4 >= 0))
      {
        arrayOfByte = new byte[2];
        byte[] tmp442_440 = arrayOfByte;
        tmp442_440[0] = 0;
        byte[] tmp448_442 = tmp442_440;
        tmp448_442[1] = 0;
        tmp448_442;
        if (paramInt3 >= 0) {
          arrayOfByte[0] = ((byte)paramInt3);
        }
        if (paramInt4 >= 0) {
          arrayOfByte[1] = ((byte)paramInt4);
        }
        ((talk)localObject).setAppCmd(415, arrayOfByte, 2);
      }
      if (paramInt5 >= 0) {
        ((talk)localObject).ct(416, paramInt5);
      }
      if (paramInt6 >= 0) {
        ((talk)localObject).ct(417, paramInt6);
      }
      if (paramInt7 >= 0) {
        ((talk)localObject).ct(418, paramInt7);
      }
      if (paramInt8 >= 0) {
        ((talk)localObject).ct(419, paramInt8);
      }
      if (paramInt9 < 0) {
        break label1867;
      }
      ((talk)localObject).ct(406, paramInt9);
      label569:
      if (paramInt10 < 0) {
        break label1886;
      }
      ((talk)localObject).ct(408, paramInt10);
      label585:
      if (paramInt11 < 0) {
        break label1905;
      }
      if ((paramInt12 >= 0) && (paramInt13 >= 0))
      {
        arrayOfByte = new byte[4];
        byte[] tmp607_605 = arrayOfByte;
        tmp607_605[0] = 0;
        byte[] tmp613_607 = tmp607_605;
        tmp613_607[1] = 0;
        byte[] tmp619_613 = tmp613_607;
        tmp619_613[2] = 0;
        byte[] tmp625_619 = tmp619_613;
        tmp625_619[3] = 0;
        tmp625_619;
        arrayOfByte[0] = ((byte)paramInt14);
        arrayOfByte[1] = ((byte)paramInt11);
        arrayOfByte[2] = ((byte)paramInt12);
        arrayOfByte[3] = ((byte)paramInt13);
        ((talk)localObject).setAppCmd(404, arrayOfByte, 4);
        com.tencent.pb.common.c.c.d("VoipAdapterUtil", new Object[] { "setAppCmd:EMethodSetAgcOn:" + arrayOfByte[0] + " " + arrayOfByte[1] });
      }
    }
    for (;;)
    {
      return 0;
      if ((com.tencent.pb.a.a.a.xkD) || (com.tencent.pb.a.a.a.xkC))
      {
        arrayOfByte = new byte[2];
        byte[] tmp739_737 = arrayOfByte;
        tmp739_737[0] = 0;
        byte[] tmp745_739 = tmp739_737;
        tmp745_739[1] = 0;
        tmp745_739;
        arrayOfByte[1] = 4;
        arrayOfByte[0] = 4;
        ((talk)localObject).setAppCmd(414, arrayOfByte, 2);
        arrayOfByte[1] = 6;
        arrayOfByte[0] = 6;
        ((talk)localObject).setAppCmd(415, arrayOfByte, 2);
        ((talk)localObject).ct(416, 1);
        ((talk)localObject).ct(417, 3);
        break;
      }
      if (com.tencent.pb.a.a.a.xlQ)
      {
        ((talk)localObject).ct(416, 1);
        break;
      }
      if (com.tencent.pb.a.a.a.xkE)
      {
        ((talk)localObject).setAppCmd(414, new byte[] { 2, 2 }, 2);
        break;
      }
      if (com.tencent.pb.a.a.a.xkF)
      {
        ((talk)localObject).setAppCmd(415, new byte[] { 2, 2 }, 2);
        ((talk)localObject).ct(417, 3);
        ((talk)localObject).ct(418, 4);
        ((talk)localObject).ct(416, 1);
        break;
      }
      if (com.tencent.pb.a.a.a.xmc)
      {
        ((talk)localObject).ct(417, 3);
        break;
      }
      if (com.tencent.pb.a.a.a.xkG)
      {
        arrayOfByte = new byte[2];
        byte[] tmp970_968 = arrayOfByte;
        tmp970_968[0] = 0;
        byte[] tmp976_970 = tmp970_968;
        tmp976_970[1] = 0;
        tmp976_970;
        arrayOfByte[0] = 2;
        arrayOfByte[1] = 1;
        ((talk)localObject).setAppCmd(414, arrayOfByte, 2);
        ((talk)localObject).ct(417, 3);
        break;
      }
      if (com.tencent.pb.a.a.a.xlR)
      {
        ((talk)localObject).ct(416, 1);
        arrayOfByte = new byte[4];
        byte[] tmp1041_1039 = arrayOfByte;
        tmp1041_1039[0] = 0;
        byte[] tmp1047_1041 = tmp1041_1039;
        tmp1047_1041[1] = 0;
        byte[] tmp1053_1047 = tmp1047_1041;
        tmp1053_1047[2] = 0;
        byte[] tmp1059_1053 = tmp1053_1047;
        tmp1059_1053[3] = 0;
        tmp1059_1053;
        arrayOfByte[0] = 2;
        arrayOfByte[1] = 2;
        arrayOfByte[2] = 12;
        arrayOfByte[3] = 9;
        ((talk)localObject).setAppCmd(404, arrayOfByte, 4);
        ((talk)localObject).ct(418, 4);
        break;
      }
      if (com.tencent.pb.a.a.a.xkH)
      {
        ((talk)localObject).ct(417, 3);
        break;
      }
      if (com.tencent.pb.a.a.a.xkI)
      {
        arrayOfByte = new byte[2];
        byte[] tmp1145_1143 = arrayOfByte;
        tmp1145_1143[0] = 0;
        byte[] tmp1151_1145 = tmp1145_1143;
        tmp1151_1145[1] = 0;
        tmp1151_1145;
        arrayOfByte[0] = 2;
        arrayOfByte[1] = 2;
        ((talk)localObject).setAppCmd(414, arrayOfByte, 2);
        arrayOfByte[0] = 0;
        arrayOfByte[1] = 1;
        ((talk)localObject).setAppCmd(415, arrayOfByte, 2);
        ((talk)localObject).ct(417, 3);
        ((talk)localObject).ct(418, 4);
        break;
      }
      if (com.tencent.pb.a.a.a.xkM)
      {
        ((talk)localObject).ct(417, 3);
        arrayOfByte = new byte[2];
        byte[] tmp1248_1246 = arrayOfByte;
        tmp1248_1246[0] = 0;
        byte[] tmp1254_1248 = tmp1248_1246;
        tmp1254_1248[1] = 0;
        tmp1254_1248;
        arrayOfByte[0] = 0;
        arrayOfByte[1] = 1;
        ((talk)localObject).setAppCmd(415, arrayOfByte, 2);
        break;
      }
      if (com.tencent.pb.a.a.a.xkJ)
      {
        arrayOfByte = new byte[2];
        byte[] tmp1299_1297 = arrayOfByte;
        tmp1299_1297[0] = 0;
        byte[] tmp1305_1299 = tmp1299_1297;
        tmp1305_1299[1] = 0;
        tmp1305_1299;
        arrayOfByte[0] = 2;
        arrayOfByte[1] = 2;
        ((talk)localObject).setAppCmd(414, arrayOfByte, 2);
        arrayOfByte[0] = 1;
        arrayOfByte[1] = 2;
        ((talk)localObject).setAppCmd(415, arrayOfByte, 2);
        ((talk)localObject).ct(417, 3);
        break;
      }
      if (com.tencent.pb.a.a.a.xkK)
      {
        arrayOfByte = new byte[2];
        byte[] tmp1382_1380 = arrayOfByte;
        tmp1382_1380[0] = 0;
        byte[] tmp1388_1382 = tmp1382_1380;
        tmp1388_1382[1] = 0;
        tmp1388_1382;
        arrayOfByte[0] = 2;
        arrayOfByte[1] = 2;
        ((talk)localObject).setAppCmd(414, arrayOfByte, 2);
        arrayOfByte[0] = 1;
        arrayOfByte[1] = 2;
        ((talk)localObject).setAppCmd(415, arrayOfByte, 2);
        ((talk)localObject).ct(417, 3);
        break;
      }
      if (com.tencent.pb.a.a.a.xkL)
      {
        arrayOfByte = new byte[4];
        byte[] tmp1465_1463 = arrayOfByte;
        tmp1465_1463[0] = 0;
        byte[] tmp1471_1465 = tmp1465_1463;
        tmp1471_1465[1] = 0;
        byte[] tmp1477_1471 = tmp1471_1465;
        tmp1477_1471[2] = 0;
        byte[] tmp1483_1477 = tmp1477_1471;
        tmp1483_1477[3] = 0;
        tmp1483_1477;
        arrayOfByte[0] = 2;
        arrayOfByte[1] = 2;
        arrayOfByte[2] = 15;
        arrayOfByte[3] = 9;
        ((talk)localObject).setAppCmd(404, arrayOfByte, 4);
        ((talk)localObject).ct(417, 3);
        break;
      }
      if (com.tencent.pb.a.a.a.xml)
      {
        ((talk)localObject).setAppCmd(414, new byte[] { 0, 6 }, 2);
        ((talk)localObject).ct(408, 2);
        ((talk)localObject).ct(417, 3);
        break;
      }
      if (com.tencent.pb.a.a.a.xkN)
      {
        ((talk)localObject).ct(417, 1);
        ((talk)localObject).ct(418, 2);
        break;
      }
      if (com.tencent.pb.a.a.a.xkR)
      {
        arrayOfByte = new byte[4];
        byte[] tmp1633_1631 = arrayOfByte;
        tmp1633_1631[0] = 0;
        byte[] tmp1639_1633 = tmp1633_1631;
        tmp1639_1633[1] = 0;
        byte[] tmp1645_1639 = tmp1639_1633;
        tmp1645_1639[2] = 0;
        byte[] tmp1651_1645 = tmp1645_1639;
        tmp1651_1645[3] = 0;
        tmp1651_1645;
        arrayOfByte[0] = 2;
        arrayOfByte[1] = 2;
        arrayOfByte[2] = 3;
        arrayOfByte[3] = 9;
        ((talk)localObject).setAppCmd(404, arrayOfByte, 4);
        ((talk)localObject).ct(417, 3);
        break;
      }
      if (com.tencent.pb.a.a.a.xkS)
      {
        ((talk)localObject).ct(419, 0);
        arrayOfByte = new byte[2];
        byte[] tmp1727_1725 = arrayOfByte;
        tmp1727_1725[0] = 0;
        byte[] tmp1733_1727 = tmp1727_1725;
        tmp1733_1727[1] = 0;
        tmp1733_1727;
        arrayOfByte[0] = 0;
        arrayOfByte[1] = 3;
        ((talk)localObject).setAppCmd(415, arrayOfByte, 2);
        break;
      }
      if (com.tencent.pb.a.a.a.xkU)
      {
        arrayOfByte = new byte[4];
        byte[] tmp1778_1776 = arrayOfByte;
        tmp1778_1776[0] = 0;
        byte[] tmp1784_1778 = tmp1778_1776;
        tmp1784_1778[1] = 0;
        byte[] tmp1790_1784 = tmp1784_1778;
        tmp1790_1784[2] = 0;
        byte[] tmp1796_1790 = tmp1790_1784;
        tmp1796_1790[3] = 0;
        tmp1796_1790;
        arrayOfByte[0] = 3;
        arrayOfByte[1] = 2;
        arrayOfByte[2] = 12;
        arrayOfByte[3] = 9;
        ((talk)localObject).setAppCmd(404, arrayOfByte, 4);
        break;
      }
      if (com.tencent.pb.a.a.a.xkV)
      {
        ((talk)localObject).ct(419, 0);
        break;
      }
      boolean bool = com.tencent.pb.a.a.a.xkT;
      break;
      label1867:
      if (paramInt9 != -2) {
        break label569;
      }
      ((talk)localObject).qO(407);
      break label569;
      label1886:
      if (paramInt10 != -2) {
        break label585;
      }
      ((talk)localObject).qO(409);
      break label585;
      label1905:
      if (paramInt11 == -2)
      {
        ((talk)localObject).qO(405);
      }
      else if (com.tencent.pb.a.a.a.xma)
      {
        arrayOfByte = new byte[4];
        tmp1937_1935 = arrayOfByte;
        tmp1937_1935[0] = 3;
        tmp1943_1937 = tmp1937_1935;
        tmp1943_1937[1] = 1;
        tmp1949_1943 = tmp1943_1937;
        tmp1949_1943[2] = 6;
        tmp1955_1949 = tmp1949_1943;
        tmp1955_1949[3] = 9;
        tmp1955_1949;
        ((talk)localObject).setAppCmd(404, arrayOfByte, 4);
        com.tencent.pb.common.c.c.d("VoipAdapterUtil", new Object[] { "setAppCmd:EMethodSetAgcOn:" + arrayOfByte[0] + " " + arrayOfByte[1] });
      }
      else if (com.tencent.pb.a.a.a.xmb)
      {
        arrayOfByte = new byte[4];
        tmp2036_2034 = arrayOfByte;
        tmp2036_2034[0] = 1;
        tmp2042_2036 = tmp2036_2034;
        tmp2042_2036[1] = 2;
        tmp2048_2042 = tmp2042_2036;
        tmp2048_2042[2] = 2;
        tmp2054_2048 = tmp2048_2042;
        tmp2054_2048[3] = 9;
        tmp2054_2048;
        ((talk)localObject).setAppCmd(404, arrayOfByte, 4);
        com.tencent.pb.common.c.c.d("VoipAdapterUtil", new Object[] { "setAppCmd:EMethodSetAgcOn:" + arrayOfByte[0] + " " + arrayOfByte[1] });
      }
    }
  }
  
  public final int a(byte[] paramArrayOfByte, short paramShort, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    f localf = a.cnN();
    int i;
    if (localf.xMq != null)
    {
      com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "sendVideo ", Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      i = localf.xMq.xLI.SendVideo(paramArrayOfByte, paramShort, paramInt1, paramInt2, paramInt3, paramInt4);
      if (paramArrayOfByte != null) {
        break label179;
      }
    }
    label179:
    for (int j = 0;; j = paramArrayOfByte.length)
    {
      com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "sendVideo buffer size: ", Integer.valueOf(j), " len: ", Short.valueOf(paramShort), " w: ", Integer.valueOf(paramInt1), " h: ", Integer.valueOf(paramInt2), " format: ", Integer.valueOf(paramInt3), " mode: ", Integer.valueOf(paramInt4) });
      return i;
      i = -1;
      break;
    }
  }
  
  /* Error */
  public final boolean a(com.tencent.pb.talkroom.sdk.a parama, com.tencent.pb.talkroom.sdk.e parame)
  {
    // Byte code:
    //   0: getstatic 53	com/tencent/pb/common/c/d:rwf	Landroid/content/Context;
    //   3: ifnonnull +26 -> 29
    //   6: ldc 28
    //   8: iconst_2
    //   9: anewarray 4	java/lang/Object
    //   12: dup
    //   13: iconst_0
    //   14: ldc_w 402
    //   17: aastore
    //   18: dup
    //   19: iconst_1
    //   20: getstatic 53	com/tencent/pb/common/c/d:rwf	Landroid/content/Context;
    //   23: aastore
    //   24: invokestatic 85	com/tencent/pb/common/c/c:k	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   27: iconst_0
    //   28: ireturn
    //   29: aload_0
    //   30: aload_1
    //   31: putfield 32	com/tencent/wecall/talkroom/model/e:xLQ	Lcom/tencent/pb/talkroom/sdk/a;
    //   34: aload_2
    //   35: invokestatic 405	com/tencent/wecall/talkroom/model/f:a	(Lcom/tencent/pb/talkroom/sdk/e;)V
    //   38: invokestatic 66	com/tencent/wecall/talkroom/model/a:cnN	()Lcom/tencent/wecall/talkroom/model/f;
    //   41: astore_3
    //   42: aload_0
    //   43: getfield 42	com/tencent/wecall/talkroom/model/e:xLT	Lcom/tencent/wecall/talkroom/model/g$a;
    //   46: astore_1
    //   47: aload_3
    //   48: getfield 409	com/tencent/wecall/talkroom/model/f:xMx	Lcom/tencent/wecall/talkroom/model/g;
    //   51: astore_3
    //   52: aload_1
    //   53: monitorenter
    //   54: aload_3
    //   55: getfield 415	com/tencent/wecall/talkroom/model/g:gBe	Ljava/util/List;
    //   58: aload_1
    //   59: invokeinterface 418 2 0
    //   64: ifeq +70 -> 134
    //   67: aload_1
    //   68: monitorexit
    //   69: invokestatic 424	com/tencent/pb/common/b/f:cjC	()Lcom/tencent/pb/common/b/f;
    //   72: aload_2
    //   73: putfield 428	com/tencent/pb/common/b/f:xnt	Lcom/tencent/pb/talkroom/sdk/e;
    //   76: invokestatic 432	com/tencent/wecall/talkroom/model/a:cnM	()Lcom/tencent/wecall/talkroom/model/a;
    //   79: pop
    //   80: invokestatic 435	com/tencent/wecall/talkroom/model/a:cnO	()V
    //   83: new 437	android/content/IntentFilter
    //   86: dup
    //   87: invokespecial 438	android/content/IntentFilter:<init>	()V
    //   90: astore_1
    //   91: aload_1
    //   92: ldc_w 439
    //   95: invokevirtual 443	android/content/IntentFilter:setPriority	(I)V
    //   98: aload_1
    //   99: ldc_w 445
    //   102: invokevirtual 448	android/content/IntentFilter:addAction	(Ljava/lang/String;)V
    //   105: getstatic 53	com/tencent/pb/common/c/d:rwf	Landroid/content/Context;
    //   108: aload_0
    //   109: getfield 37	com/tencent/wecall/talkroom/model/e:xLS	Lcom/tencent/pb/common/system/ConnectReceiver;
    //   112: aload_1
    //   113: invokevirtual 454	android/content/Context:registerReceiver	(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    //   116: pop
    //   117: ldc 28
    //   119: iconst_1
    //   120: anewarray 4	java/lang/Object
    //   123: dup
    //   124: iconst_0
    //   125: ldc_w 456
    //   128: aastore
    //   129: invokestatic 152	com/tencent/pb/common/c/c:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   132: iconst_1
    //   133: ireturn
    //   134: aload_3
    //   135: getfield 415	com/tencent/wecall/talkroom/model/g:gBe	Ljava/util/List;
    //   138: aload_1
    //   139: invokeinterface 230 2 0
    //   144: pop
    //   145: aload_1
    //   146: monitorexit
    //   147: goto -78 -> 69
    //   150: astore_2
    //   151: aload_1
    //   152: monitorexit
    //   153: aload_2
    //   154: athrow
    //   155: astore_1
    //   156: ldc 28
    //   158: iconst_2
    //   159: anewarray 4	java/lang/Object
    //   162: dup
    //   163: iconst_0
    //   164: ldc_w 458
    //   167: aastore
    //   168: dup
    //   169: iconst_1
    //   170: aload_1
    //   171: aastore
    //   172: invokestatic 85	com/tencent/pb/common/c/c:k	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   175: iconst_0
    //   176: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	177	0	this	e
    //   0	177	1	parama	com.tencent.pb.talkroom.sdk.a
    //   0	177	2	parame	com.tencent.pb.talkroom.sdk.e
    //   41	94	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   54	69	150	finally
    //   134	147	150	finally
    //   151	153	150	finally
    //   29	54	155	java/lang/Exception
    //   69	132	155	java/lang/Exception
    //   153	155	155	java/lang/Exception
  }
  
  public final boolean a(String paramString, int paramInt1, long paramLong, int paramInt2)
  {
    f.b localb = a.cnN().a(null, paramString, paramInt1, paramLong, paramInt2, 100);
    com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "enterMultiTalk multiTalkGroupid:", paramString, " roomId: ", Integer.valueOf(paramInt1), " roomKey: ", Long.valueOf(paramLong), " routId: ", Integer.valueOf(paramInt2), " ret: ", localb });
    return localb == f.b.xNf;
  }
  
  public final void aN(int paramInt, String paramString)
  {
    com.tencent.pb.b.a.a.El(paramInt);
    com.tencent.pb.b.a.a.WP(paramString);
    com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "setWxUinAndUsrName uin: ", Integer.valueOf(paramInt), " usrname: ", paramString });
  }
  
  public final g b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    f localf = a.cnN();
    g localg = new g();
    int i;
    if (localf.xMq != null)
    {
      b localb = localf.xMq;
      i = localb.xLI.videoTrans(paramArrayOfByte, paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt);
      localg = new g();
      localg.xru = paramArrayOfInt;
      localg.xrv = localb.xLI.field_localImgWidth;
      localg.xrw = localb.xLI.field_localImgHeight;
      localg.ret = i;
    }
    com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "videoTrans ", Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), " multiTalkVideoRGBinfo: ", localg, " engine: ", localf.xMq });
    if (paramArrayOfByte == null)
    {
      i = 0;
      if (paramArrayOfInt != null) {
        break label278;
      }
    }
    label278:
    for (int j = 0;; j = paramArrayOfInt.length)
    {
      com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "videoTrans recordData size: ", Integer.valueOf(i), " len: ", Integer.valueOf(paramInt1), " localImg size: ", Integer.valueOf(j), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), " multiTalkVideoRGBinfo: ", localg });
      return localg;
      i = paramArrayOfByte.length;
      break;
    }
  }
  
  public final boolean by(byte[] paramArrayOfByte)
  {
    com.tencent.pb.common.b.f.cjC();
    int i = com.tencent.pb.common.b.f.bx(paramArrayOfByte);
    com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "handleMultiTalkNotify ret: ", Integer.valueOf(i) });
    return i == 0;
  }
  
  public final boolean c(int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfByte)
  {
    int i;
    if (paramArrayOfByte == null)
    {
      i = 0;
      com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "handleMultiTalkResp retCode: ", Integer.valueOf(paramInt1), " seq: ", Integer.valueOf(paramInt2), " cmdId: ", Integer.valueOf(paramInt3), " data length: ", Integer.valueOf(i) });
      if (paramInt1 != 0) {
        break label97;
      }
      com.tencent.pb.common.b.f.cjC().o(paramInt2, paramArrayOfByte);
    }
    label97:
    com.tencent.pb.common.b.f.a locala;
    do
    {
      return true;
      i = paramArrayOfByte.length;
      break;
      paramArrayOfByte = com.tencent.pb.common.b.f.cjC();
      locala = paramArrayOfByte.Ek(paramInt2);
    } while (locala == null);
    com.tencent.pb.common.c.c.k("NETCMD", new Object[] { "CLTRCV FAIL", Integer.valueOf(paramInt2), locala.xnw, Integer.valueOf(1), Integer.valueOf(paramInt1) });
    paramArrayOfByte.a(locala, -1, null);
    return true;
  }
  
  public final boolean cjX()
  {
    try
    {
      com.tencent.pb.common.c.c.v(true, 0);
      com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "setOpenLog: isOpenSdkLog", Boolean.valueOf(true), " level: ", Integer.valueOf(0) });
      return true;
    }
    catch (Throwable localThrowable)
    {
      com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "setOpenLog: ", localThrowable });
    }
    return false;
  }
  
  public final String cjY()
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("client_");
    ((StringBuilder)localObject).append(com.tencent.pb.b.a.a.cjV());
    ((StringBuilder)localObject).append("_");
    ((StringBuilder)localObject).append(System.currentTimeMillis());
    localObject = ((StringBuilder)localObject).toString();
    com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "genMultiTalkClientId clientId: ", localObject });
    return (String)localObject;
  }
  
  public final boolean dm(String paramString, int paramInt)
  {
    Object localObject = a.cnN();
    localObject = ((f)localObject).a(null, paramString, ((f)localObject).ndF, ((f)localObject).xMh, paramInt, 1);
    com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "enterMultiTalk multiTalkGroupid:", paramString, " isAccept: ", Boolean.valueOf(true), " routId: ", Integer.valueOf(paramInt), " ret: ", localObject });
    return localObject == f.b.xNf;
  }
  
  public final boolean f(String paramString1, String paramString2, List<String> paramList)
  {
    f localf = a.cnN();
    Object localObject1 = f.df(paramList);
    int i;
    if (localObject1.length > 0)
    {
      if (TextUtils.isEmpty(null)) {
        break label289;
      }
      throw new NullPointerException();
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "createTalkRoom cliendId: ", paramString1, " voiceSingle2MultiInfo: ", null, " memeberUuids size: ", Integer.valueOf(localObject1.length), "routeId", Integer.valueOf(i), " context: ", null, " type: ", Integer.valueOf(0), " playId: ", Long.valueOf(0L), " sdkKey: ", null });
      if (com.tencent.pb.b.a.a.cjW()) {
        break label318;
      }
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "createTalkRoom isAuthed: ", Boolean.valueOf(com.tencent.pb.b.a.a.cjW()), " isBindMobile: ", Boolean.valueOf(true) });
      h.a("", paramString1, 0, 0L, new String[] { "create", "req", "false", "noAuth" });
    }
    for (;;)
    {
      paramString1 = null;
      com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "createTalkRoom clientId is: ", paramString1, "wXgroupId: ", paramString2, " creatorUsrName: ", com.tencent.pb.b.a.a.cjV(), " usrnameList: ", paramList });
      if (paramString1 == null) {
        break label986;
      }
      return true;
      label289:
      i = new Random().nextInt() << 16 | com.tencent.pb.b.a.a.cjV().hashCode() & 0xFFFF;
      break;
      label318:
      if (!com.tencent.pb.common.b.h.isNetworkConnected())
      {
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "createTalkRoom isNetworkConnected is false" });
        h.FE(61533);
        h.a("", paramString1, 0, 0L, new String[] { "create", "req", "false", "noNetwork" });
      }
      else if (localf.brT())
      {
        if (localf.brT()) {
          h.FE(61534);
        }
        h.a("", paramString1, 0, 0L, new String[] { "create", "req", "false", "isBusy" });
      }
      else if (TextUtils.isEmpty(paramString1))
      {
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "createTalkRoom cliendId is null" });
        h.a("", paramString1, 0, 0L, new String[] { "create", "req", "false", "cliendIdnull" });
      }
      else if (!j.Yi(paramString1))
      {
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "createTalkRoom groupId is not cliend id: ", paramString1 });
        h.a("", paramString1, 0, 0L, new String[] { "create", "req", "false", "isnotcliendId" });
      }
      else
      {
        if (c.cnZ().XW(paramString1) == null) {
          c.cnZ().a(paramString1, paramString2, 0, 0, (String[])localObject1);
        }
        localf.col();
        localf.mR(false);
        localf.coi();
        if (localf.bqA()) {
          break label684;
        }
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "createTalkRoom initEngine fail" });
        h.a("", paramString1, 0, 0L, new String[] { "create", "req", "false", "initEnginefail" });
        localf.mR(false);
      }
    }
    label684:
    localf.xMp.cot();
    localf.mHz = paramString1;
    localf.xMB = paramString1;
    localf.xnh = i;
    localf.xMg = paramString1;
    localf.setState(1);
    localf.rpz = true;
    Object localObject2 = new f.a(localf);
    ((f.a)localObject2).groupId = localf.mHz;
    ((f.a)localObject2).xMZ = ((String[])localObject1);
    ((f.a)localObject2).xNa = null;
    ((f.a)localObject2).xnS = i;
    ((f.a)localObject2).type = 0;
    ((f.a)localObject2).xNb = 0L;
    ((f.a)localObject2).xNc = null;
    ((f.a)localObject2).xNd = false;
    ((f.a)localObject2).xNe = paramString2;
    localObject1 = Message.obtain();
    ((Message)localObject1).what = 2;
    ((Message)localObject1).obj = localObject2;
    localf.mHandler.removeMessages(2);
    localObject2 = c.cnZ().XW(localf.mHz);
    if (localObject2 == null) {
      com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "isOnlyMySelfInGroup talkroom is null" });
    }
    for (;;)
    {
      localf.mHandler.sendMessage((Message)localObject1);
      localf.xMD = true;
      break;
      localObject2 = ((TalkRoom)localObject2).cnT();
      if ((localObject2 == null) || (((List)localObject2).size() != 1))
      {
        com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "isOnlyMySelfInGroup TalkRoomMember list is not match" });
      }
      else
      {
        localObject2 = (d)((List)localObject2).get(0);
        if (localObject2 == null) {
          com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "isOnlyMySelfInGroup talkRoomMember is null" });
        } else {
          com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "isOnlyMySelfInGroup ret: ", Boolean.valueOf(((d)localObject2).cod()) });
        }
      }
    }
    label986:
    return false;
  }
  
  public final void gm(boolean paramBoolean)
  {
    a.cnN();
    com.tencent.pb.talkroom.sdk.e locale = f.cor();
    if (locale != null) {}
    for (boolean bool = locale.gi(paramBoolean);; bool = false)
    {
      com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "switchSpeakerPhone", Boolean.valueOf(paramBoolean), " ret: ", Boolean.valueOf(bool), " realret: ", Boolean.valueOf(f.sr()), " wxCallBack: ", locale });
      return;
    }
  }
  
  public final void mF(boolean paramBoolean)
  {
    f localf = a.cnN();
    com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "setMute isMute: ", Boolean.valueOf(paramBoolean) });
    localf.frc = paramBoolean;
    com.tencent.pb.common.c.i.ab(new g.12(localf.xMx, paramBoolean));
  }
  
  public final boolean mG(boolean paramBoolean)
  {
    com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "holadMultiTalk isHold", Boolean.valueOf(paramBoolean) });
    f localf;
    if (paramBoolean)
    {
      localf = a.cnN();
      com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "syscall", "startHoldOn" });
      localf.xML = true;
      localf.mS(false);
      com.tencent.pb.common.c.i.ab(new g.8(localf.xMx));
    }
    do
    {
      return true;
      localf = a.cnN();
      com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "syscall", "endHoldOn" });
      localf.xML = false;
      localf.coj();
    } while ((!localf.brT()) || (!localf.nnu));
    localf.mS(true);
    com.tencent.pb.common.c.i.ab(new g.9(localf.xMx));
    return true;
  }
  
  public final boolean qQ(int paramInt)
  {
    if (!a.cnN().brT())
    {
      com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "switchMultiTalkVideo isWorking is false" });
      return false;
    }
    com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "switchMultiTalkVideo action: ", Integer.valueOf(paramInt) });
    Object localObject = a.cnN();
    if (TextUtils.isEmpty(((f)localObject).mHz))
    {
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "switchMultiTalkVideo mGroupId is null" });
      return false;
    }
    ((f)localObject).xMo = paramInt;
    localObject = new k(((f)localObject).mHz, ((f)localObject).ndF, ((f)localObject).xMh, paramInt);
    boolean bool = com.tencent.pb.common.b.e.cjz().a((com.tencent.pb.common.b.d)localObject);
    com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "switchMultiTalkVideo ret: ", Boolean.valueOf(bool) });
    return bool;
  }
  
  public final com.tencent.pb.talkroom.sdk.f r(int[] paramArrayOfInt)
  {
    int j = 0;
    Object localObject1 = a.cnN();
    Object localObject2;
    if (((f)localObject1).xMq != null)
    {
      com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "receiveVideo" });
      localObject2 = ((f)localObject1).xMq;
      localObject1 = new com.tencent.pb.talkroom.sdk.f();
      if (paramArrayOfInt == null)
      {
        com.tencent.pb.common.c.c.k("simon:TalkRoomContext", new Object[] { "receiveVideo imgBuffer is null" });
        if (paramArrayOfInt != null) {
          break label470;
        }
      }
    }
    label232:
    label233:
    label238:
    label350:
    label452:
    label470:
    for (int i = j;; i = paramArrayOfInt.length)
    {
      com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "receiveVideo imgBuffer size: ", Integer.valueOf(i), " MultiTalkVideoDecodeInfo: ", localObject1 });
      return (com.tencent.pb.talkroom.sdk.f)localObject1;
      ((com.tencent.pb.talkroom.sdk.f)localObject1).ret = ((b)localObject2).xLI.videoDecode(paramArrayOfInt);
      ((com.tencent.pb.talkroom.sdk.f)localObject1).xrp = paramArrayOfInt;
      ((com.tencent.pb.talkroom.sdk.f)localObject1).xrq = ((b)localObject2).xLI.field_remoteImgLength;
      ((com.tencent.pb.talkroom.sdk.f)localObject1).xrr = ((b)localObject2).xLI.field_remoteImgWidth;
      ((com.tencent.pb.talkroom.sdk.f)localObject1).xrs = ((b)localObject2).xLI.field_remoteImgHeight;
      ((com.tencent.pb.talkroom.sdk.f)localObject1).xrt = (((b)localObject2).xLI.field_remoteImgChannel & 0x7FFF);
      Object localObject3 = c.cnZ();
      localObject2 = a.cnN().mHz;
      i = ((com.tencent.pb.talkroom.sdk.f)localObject1).xrt;
      if (TextUtils.isEmpty((CharSequence)localObject2))
      {
        com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "getUsrNameByMemberId groupId is null memberId: ", Integer.valueOf(i) });
        break label350;
        localObject2 = "";
        ((com.tencent.pb.talkroom.sdk.f)localObject1).xrn = ((String)localObject2);
        if (paramArrayOfInt != null) {
          break label452;
        }
      }
      for (i = 0;; i = paramArrayOfInt.length)
      {
        com.tencent.pb.common.c.c.d("simon:TalkRoomContext", new Object[] { "receiveVideo imgBuffer size:", Integer.valueOf(i), " MultiTalkVideoDecodeInfo: ", localObject1 });
        break;
        localObject3 = ((c)localObject3).XW((String)localObject2);
        if (localObject3 == null)
        {
          com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "getUsrNameByMemberId talkRoom is null groupId: ", localObject2, " memberId: ", Integer.valueOf(i) });
          break label233;
        }
        localObject3 = ((TalkRoom)localObject3).cnW().iterator();
        if (!((Iterator)localObject3).hasNext()) {
          break label233;
        }
        a.as localas = (a.as)((Iterator)localObject3).next();
        if ((localas == null) || (localas.mXM != i)) {
          break label232;
        }
        com.tencent.pb.common.c.c.d("TalkRoomManager", new Object[] { "getUsrNameByMemberId wxUserName:", localas.xps, " groupId: ", localObject2, " memberId: ", Integer.valueOf(i) });
        if (localas.xps == null) {
          break label233;
        }
        localObject2 = localas.xps;
        break label238;
      }
      localObject1 = new com.tencent.pb.talkroom.sdk.f();
      break;
    }
  }
  
  public final boolean s(String paramString, List<String> paramList)
  {
    if (!com.tencent.pb.common.c.h.fi(paramString, a.cnN().mHz))
    {
      com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "addMultiTalkMember groupid is not same; multiTalkGroupid: ", paramString, a.cnN().mHz });
      return false;
    }
    f localf = a.cnN();
    int j = localf.ndF;
    long l = localf.xMh;
    int i;
    boolean bool;
    if (paramList == null)
    {
      i = 0;
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "addrTalkRoomMember", paramString, Integer.valueOf(j), Long.valueOf(l), " users length: ", Integer.valueOf(i) });
      localf.xMD = false;
      if ((!TextUtils.isEmpty(paramString)) && (paramList != null)) {
        break label173;
      }
      bool = false;
    }
    for (;;)
    {
      com.tencent.pb.common.c.c.k("TalkRoomSdkApi", new Object[] { "addMultiTalkMember ret: ", Boolean.valueOf(bool) });
      return bool;
      i = paramList.size();
      break;
      label173:
      if (!com.tencent.pb.common.b.h.isNetworkConnected())
      {
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "addTalkRoomMember isNetworkConnected is false" });
        bool = false;
      }
      else
      {
        paramList = f.df(paramList);
        if (paramList.length <= 0)
        {
          com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "addTalkRoomMember users is null" });
          bool = false;
        }
        else
        {
          paramString = new com.tencent.wecall.talkroom.a.b(paramString, localf.ndF, localf.xMh, paramList);
          bool = com.tencent.pb.common.b.e.cjz().a(paramString);
          localf.xMp.N(new String[] { "add", "req", String.valueOf(bool), String.valueOf(localf.state) });
        }
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/wecall/talkroom/model/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */