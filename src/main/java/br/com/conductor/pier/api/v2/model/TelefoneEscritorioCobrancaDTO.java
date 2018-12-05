package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{telefone_escritorio_cobranca_d_t_o_description}}}
 **/
@ApiModel(description = "{{{telefone_escritorio_cobranca_d_t_o_description}}}")
public class TelefoneEscritorioCobrancaDTO  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("ddd")
  private String ddd = null;
  @SerializedName("telefone")
  private String telefone = null;
  @SerializedName("ramal")
  private String ramal = null;

  
  /**
   * {{{telefone_escritorio_cobranca_d_t_o_id}}}
   **/
  @ApiModelProperty(value = "{{{telefone_escritorio_cobranca_d_t_o_id}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{telefone_escritorio_cobranca_d_t_o_ddd_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{telefone_escritorio_cobranca_d_t_o_ddd_value}}}")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * {{{telefone_escritorio_cobranca_d_t_o_telefone_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{telefone_escritorio_cobranca_d_t_o_telefone_value}}}")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  
  /**
   * {{{telefone_escritorio_cobranca_d_t_o_ramal_value}}}
   **/
  @ApiModelProperty(value = "{{{telefone_escritorio_cobranca_d_t_o_ramal_value}}}")
  public String getRamal() {
    return ramal;
  }
  public void setRamal(String ramal) {
    this.ramal = ramal;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelefoneEscritorioCobrancaDTO {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  ddd: ").append(ddd).append("\n");
    sb.append("  telefone: ").append(telefone).append("\n");
    sb.append("  ramal: ").append(ramal).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
