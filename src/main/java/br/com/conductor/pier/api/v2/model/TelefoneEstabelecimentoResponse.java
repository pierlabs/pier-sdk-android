package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{telefone_estabelecimento_response_description}}}
 **/
@ApiModel(description = "{{{telefone_estabelecimento_response_description}}}")
public class TelefoneEstabelecimentoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idEstabelecimento")
  private Long idEstabelecimento = null;
  @SerializedName("ddd")
  private String ddd = null;
  @SerializedName("telefone")
  private String telefone = null;
  @SerializedName("ramal")
  private String ramal = null;

  
  /**
   * {{{telefone_estabelecimento_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{telefone_estabelecimento_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{telefone_estabelecimento_response_id_estabelecimento_value}}}
   **/
  @ApiModelProperty(value = "{{{telefone_estabelecimento_response_id_estabelecimento_value}}}")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * {{{telefone_estabelecimento_response_ddd_value}}}
   **/
  @ApiModelProperty(value = "{{{telefone_estabelecimento_response_ddd_value}}}")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * {{{telefone_estabelecimento_response_telefone_value}}}
   **/
  @ApiModelProperty(value = "{{{telefone_estabelecimento_response_telefone_value}}}")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  
  /**
   * {{{telefone_estabelecimento_response_ramal_value}}}
   **/
  @ApiModelProperty(value = "{{{telefone_estabelecimento_response_ramal_value}}}")
  public String getRamal() {
    return ramal;
  }
  public void setRamal(String ramal) {
    this.ramal = ramal;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelefoneEstabelecimentoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idEstabelecimento: ").append(idEstabelecimento).append("\n");
    sb.append("  ddd: ").append(ddd).append("\n");
    sb.append("  telefone: ").append(telefone).append("\n");
    sb.append("  ramal: ").append(ramal).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


