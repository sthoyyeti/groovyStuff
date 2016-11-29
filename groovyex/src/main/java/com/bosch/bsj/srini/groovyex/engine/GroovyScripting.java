package com.bosch.bsj.srini.groovyex.engine;

import javax.script.*;

public class GroovyScripting {
  public static void main(String[] args) throws Exception {
    ScriptEngine engine = new ScriptEngineManager().getEngineByName("groovy");
    Bindings bindings = engine.getBindings(ScriptContext.ENGINE_SCOPE);
    
    bindings.put("counter", 0);
    bindings.put("args", new String[] {"hello", "world"});
    
    String LF = "\n";
    String code = ""
        + "counter += 1" + LF
        + "println args[0]" + LF
        + "['a':123, 3:'b']";
                    
    System.out.println(((java.util.Map)engine.eval(code)).get("a"));
  
    System.out.println(bindings.get("counter"));
  }
}