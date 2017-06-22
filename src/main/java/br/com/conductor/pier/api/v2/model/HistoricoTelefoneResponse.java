package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Objeto de resposta para historico de telefones
 **/
@ApiModel(description = "Objeto de resposta para historico de telefones")
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
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Telefone (id).
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Telefone (id).")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Apresenta o N\u00C3\u00BAmero do telefone.
   **/
  @ApiModelProperty(value = "Apresenta o N\u00C3\u00BAmero do telefone.")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  
  /**
   * Apresenta o id do tipo do telefone.
   **/
  @ApiModelProperty(value = "Apresenta o id do tipo do telefone.")
  public Long getIdTipoTelefone() {
    return idTipoTelefone;
  }
  public void setIdTipoTelefone(Long idTipoTelefone) {
    this.idTipoTelefone = idTipoTelefone;
  }

  
  /**
   * Apresenta a descri\u00C3\u00A7\u00C3\u00A3o do tipo do telefone.
   **/
  @ApiModelProperty(value = "Apresenta a descri\u00C3\u00A7\u00C3\u00A3o do tipo do telefone.")
  public String getTipoTelefone() {
    return tipoTelefone;
  }
  public void setTipoTelefone(String tipoTelefone) {
    this.tipoTelefone = tipoTelefone;
  }

  
  /**
   * Apresenta a data que o telefone fora alterado.
   **/
  @ApiModelProperty(value = "Apresenta a data que o telefone fora alterado.")
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


