package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{historico_telefone_response_description}}}
 **/
@ApiModel(description = "{{{historico_telefone_response_description}}}")
public class HistoricoTelefoneResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("telefone")
  private String telefone = null;
  @SerializedName("idTipoTelefone")
  private Long idTipoTelefone = null;
  @SerializedName("tipoTelefone")
  private String tipoTelefone = null;
  @SerializedName("dataModificacao")
  private String dataModificacao = null;

  
  /**
   * {{{historico_telefone_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{historico_telefone_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{historico_telefone_response_telefone_value}}}
   **/
  @ApiModelProperty(value = "{{{historico_telefone_response_telefone_value}}}")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  
  /**
   * {{{historico_telefone_response_id_tipo_telefone_value}}}
   **/
  @ApiModelProperty(value = "{{{historico_telefone_response_id_tipo_telefone_value}}}")
  public Long getIdTipoTelefone() {
    return idTipoTelefone;
  }
  public void setIdTipoTelefone(Long idTipoTelefone) {
    this.idTipoTelefone = idTipoTelefone;
  }

  
  /**
   * {{{historico_telefone_response_tipo_telefone_value}}}
   **/
  @ApiModelProperty(value = "{{{historico_telefone_response_tipo_telefone_value}}}")
  public String getTipoTelefone() {
    return tipoTelefone;
  }
  public void setTipoTelefone(String tipoTelefone) {
    this.tipoTelefone = tipoTelefone;
  }

  
  /**
   * {{{historico_telefone_response_data_modificacao_value}}}
   **/
  @ApiModelProperty(value = "{{{historico_telefone_response_data_modificacao_value}}}")
  public String getDataModificacao() {
    return dataModificacao;
  }
  public void setDataModificacao(String dataModificacao) {
    this.dataModificacao = dataModificacao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricoTelefoneResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  telefone: ").append(telefone).append("\n");
    sb.append("  idTipoTelefone: ").append(idTipoTelefone).append("\n");
    sb.append("  tipoTelefone: ").append(tipoTelefone).append("\n");
    sb.append("  dataModificacao: ").append(dataModificacao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
