package com.tencent.mm.plugin.backup.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelvideo.p;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.plugin.backup.a.h;
import com.tencent.mm.plugin.backup.g.a;
import com.tencent.mm.plugin.backup.g.c;
import com.tencent.mm.plugin.backup.g.d;
import com.tencent.mm.plugin.backup.h.u;
import com.tencent.mm.protocal.c.axt;
import com.tencent.mm.protocal.c.eh;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.j;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import java.io.File;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

public final class k
  implements e
{
  public k()
  {
    GMTrace.i(14819918872576L, 110417);
    GMTrace.o(14819918872576L, 110417);
  }
  
  private static String a(eh parameh, au paramau)
  {
    GMTrace.i(14820321525760L, 110420);
    r localr = d.sV(paramau.field_imgPath);
    if (localr == null)
    {
      GMTrace.o(14820321525760L, 110420);
      return null;
    }
    if (paramau.field_type == 62) {}
    for (int i = 62;; i = 43)
    {
      parameh.jXP = i;
      if (!bg.mZ(paramau.field_content)) {
        break;
      }
      GMTrace.o(14820321525760L, 110420);
      return null;
    }
    if (d.dW(paramau.field_talker)) {}
    for (parameh = localr.Nk();; parameh = parameh.tvo.usj)
    {
      paramau = new StringWriter();
      try
      {
        XmlSerializer localXmlSerializer = XmlPullParserFactory.newInstance().newSerializer();
        localXmlSerializer.setOutput(paramau);
        localXmlSerializer.startTag(null, "msg");
        localXmlSerializer.startTag(null, "videomsg");
        Map localMap = bh.p(localr.Nm(), "msg");
        if (localMap != null)
        {
          localXmlSerializer.attribute(null, "aeskey", (String)localMap.get(".msg.videomsg.$aeskey"));
          localXmlSerializer.attribute(null, "cdnthumbaeskey", (String)localMap.get(".msg.videomsg.$cdnthumbaeskey"));
          localXmlSerializer.attribute(null, "cdnvideourl", (String)localMap.get(".msg.videomsg.$cdnvideourl"));
          localXmlSerializer.attribute(null, "cdnthumburl", (String)localMap.get(".msg.videomsg.$cdnthumburl"));
          localXmlSerializer.attribute(null, "cdnthumblength", (String)localMap.get(".msg.videomsg.$cdnthumblength"));
        }
        localXmlSerializer.attribute(null, "playlength", localr.hUz);
        localXmlSerializer.attribute(null, "length", localr.hld);
        localXmlSerializer.attribute(null, "type", String.valueOf(i));
        if (!bg.mZ(parameh)) {
          localXmlSerializer.attribute(null, "fromusername", parameh);
        }
        localXmlSerializer.attribute(null, "md5", localr.fMM);
        localXmlSerializer.endTag(null, "videomsg");
        localXmlSerializer.endTag(null, "msg");
        localXmlSerializer.endDocument();
        paramau.flush();
        paramau.close();
        parameh = paramau.getBuffer().toString();
        w.d("MicroMsg.MMBakItemVideo", "parseContent xml:" + parameh);
        GMTrace.o(14820321525760L, 110420);
        return parameh;
      }
      catch (Exception parameh)
      {
        w.e("MicroMsg.MMBakItemVideo", "packetVoice xml error: " + parameh.toString());
        GMTrace.o(14820321525760L, 110420);
      }
    }
    return null;
  }
  
  public final int a(eh parameh, boolean paramBoolean1, au paramau, String paramString, LinkedList<u> paramLinkedList, HashMap<Long, a.c> paramHashMap, boolean paramBoolean2, long paramLong)
  {
    GMTrace.i(14820053090304L, 110418);
    a.afe().aff().Na();
    paramString = s.lX(paramau.field_imgPath);
    paramHashMap = d.sV(paramau.field_imgPath);
    int j;
    if ((paramHashMap == null) || (paramHashMap.status == 199))
    {
      j = 1;
      paramHashMap = new File(paramString);
      if ((j == 0) || (!paramHashMap.exists())) {
        break label367;
      }
    }
    label300:
    label364:
    label367:
    for (int k = (int)paramHashMap.length();; k = 0)
    {
      int m = 0;
      a.afe().aff().Na();
      paramHashMap = s.lY(paramau.field_imgPath);
      File localFile = new File(paramHashMap);
      if (localFile.exists()) {
        m = (int)localFile.length();
      }
      if (paramBoolean1)
      {
        GMTrace.o(14820053090304L, 110418);
        return m + k;
        j = 0;
        break;
      }
      int i = 0;
      if (m != 0)
      {
        if (paramau.field_type == 62) {
          i = b.a(new b.a(paramHashMap, parameh, paramLinkedList, 13, paramBoolean1, "_thumb", paramBoolean2)) + 0;
        }
      }
      else
      {
        if ((j == 0) || (k == 0)) {
          break label364;
        }
        if (paramau.field_type != 62) {
          break label300;
        }
        i = b.a(new b.a(paramString, parameh, paramLinkedList, 12, paramBoolean1, paramBoolean2, null)) + i;
      }
      for (;;)
      {
        paramau = a(parameh, paramau);
        if (paramau == null)
        {
          GMTrace.o(14820053090304L, 110418);
          return i;
          i = b.a(new b.a(paramHashMap, parameh, paramLinkedList, 11, paramBoolean1, "_thumb", paramBoolean2)) + 0;
          break;
          i = b.a(new b.a(paramString, parameh, paramLinkedList, 10, paramBoolean1, paramBoolean2, null)) + i;
          continue;
        }
        parameh.tvq = new axt().Qx(paramau);
        j = paramau.length();
        GMTrace.o(14820053090304L, 110418);
        return i + j;
      }
    }
  }
  
  public final int a(String paramString, eh parameh, au paramau)
  {
    GMTrace.i(14820187308032L, 110419);
    paramString = new r();
    paramString.fJp = parameh.tvo.usj;
    paramString.hUw = paramau.field_createTime;
    paramString.fLa = parameh.tvv;
    Object localObject = parameh.tvq.usj;
    w.d("MicroMsg.MMBakItemVideo", "parseVideoMsgXML content:" + (String)localObject);
    localObject = bh.p((String)localObject, "msg");
    if (localObject != null)
    {
      try
      {
        paramString.hld = h.aB((String)((Map)localObject).get(".msg.videomsg.$length"), 0);
        paramString.hUz = h.aB((String)((Map)localObject).get(".msg.videomsg.$playlength"), 0);
        paramString.hUr = ((String)((Map)localObject).get(".msg.videomsg.$fromusername"));
        i = h.aB((String)((Map)localObject).get(".msg.videomsg.$type"), 0);
        w.d("MicroMsg.MMBakItemVideo", "video msg exportType :" + i);
        if (i != 44) {
          break label490;
        }
        i = 1;
        paramString.hUD = i;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          int i;
          label207:
          label232:
          w.e("MicroMsg.MMBakItemVideo", "parsing voice msg xml failed");
          w.printErrStackTrace("MicroMsg.MMBakItemVideo", localException, "", new Object[0]);
        }
      }
      if ((!h.d(parameh, 10)) && (!h.d(parameh, 12))) {
        break label559;
      }
      paramString.status = 199;
      localObject = s.lW(paramString.Nk());
      paramau.cX((String)localObject);
      paramString.fnP = ((String)localObject);
      if (paramau.field_type != 62) {
        paramau.setType(43);
      }
      paramau.setContent(p.b(paramString.Nk(), paramString.hUy, false));
      paramString.hUA = ((int)d.i(paramau));
      paramString.hUx = bg.Po();
      paramString.hUB = 0;
      w.d("MicroMsg.MMBakItemVideo", "Insert fileName[" + paramString.getFileName() + "] size:" + paramString.hld + " svrid:" + paramString.fLa + " timelen:" + paramString.hUz + " user:" + paramString.Nj() + " human:" + paramString.Nk());
      a.afe().aff().Na().a(paramString);
      a.afe().aff().Na();
      paramString = s.lY((String)localObject);
      if (paramau.field_type != 62) {
        break label568;
      }
      h.b(parameh, 13, paramString);
    }
    for (paramString = h.a(parameh, 12);; paramString = h.a(parameh, 10))
    {
      if (paramString != null)
      {
        paramString = h.sM(paramString);
        a.afe().aff().Na();
        j.r(paramString, s.lX((String)localObject), false);
      }
      GMTrace.o(14820187308032L, 110419);
      return 0;
      label490:
      i = 0;
      break;
      w.e("MicroMsg.MMBakItemVideo", "videomsg paseXml failed:%s", new Object[] { parameh.tvq.usj });
      paramau.setContent(parameh.tvq.usj);
      break label207;
      label559:
      paramString.status = 111;
      break label232;
      label568:
      h.b(parameh, 11, paramString);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/e/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */