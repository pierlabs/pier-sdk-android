package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{telefone_estabelecimento_update_description}}}
 **/
@ApiModel(description = "{{{telefone_estabelecimento_update_description}}}")
public class TelefoneEstabelecimentoUpdate  {
  
  @SerializedName("ddd")
  private String ddd = null;
  @SerializedName("telefone")
  private String telefone = null;
  @SerializedName("ramal")
  private String ramal = null;

  
  /**
   * {{{telefone_estabelecimento_update_ddd_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{telefone_estabelecimento_update_ddd_value}}}")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * {{{telefone_estabelecimento_update_telefone_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{telefone_estabelecimento_update_telefone_value}}}")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  
  /**
   * {{{telefone_estabelecimento_update_ramal_value}}}
   **/
  @ApiModelProperty(value = "{{{telefone_estabelecimento_update_ramal_value}}}")
  public String getRamal() {
    return ramal;
  }
  public void setRamal(String ramal) {
    this.ramal = ramal;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelefoneEstabelecimentoUpdate {\n");
    
    sb.append("  ddd: ").append(ddd).append("\n");
    sb.append("  telefone: ").append(telefone).append("\n");
    sb.append("  ramal: ").append(ramal).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


