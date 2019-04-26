package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto Response do Servi\u00E7o Conta
 **/
@ApiModel(description = "Objeto Response do Servi\u00E7o Conta")
public class ServicoContaResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idTipoServico")
  private Long idTipoServico = null;
  @SerializedName("dataAtivacao")
  private String dataAtivacao = null;
  @SerializedName("idUsuarioAtivacao")
  private Long idUsuarioAtivacao = null;
  @SerializedName("idPlataformaAtivacao")
  private Long idPlataformaAtivacao = null;
  @SerializedName("dataCancelamento")
  private String dataCancelamento = null;
  @SerializedName("idUsuarioCancelamento")
  private Long idUsuarioCancelamento = null;
  @SerializedName("idPlataformaCancelamento")
  private Long idPlataformaCancelamento = null;

  
  /**
   * Identificador do Servi\u00E7o Conta
   **/
  @ApiModelProperty(value = "Identificador do Servi\u00E7o Conta")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identificador da Conta
   **/
  @ApiModelProperty(value = "Identificador da Conta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Identificador do Tipo de Servi\u00E7o
   **/
  @ApiModelProperty(value = "Identificador do Tipo de Servi\u00E7o")
  public Long getIdTipoServico() {
    return idTipoServico;
  }
  public void setIdTipoServico(Long idTipoServico) {
    this.idTipoServico = idTipoServico;
  }

  
  /**
   * Data ativa\u00E7\u00E3o do servi\u00E7o
   **/
  @ApiModelProperty(value = "Data ativa\u00E7\u00E3o do servi\u00E7o")
  public String getDataAtivacao() {
    return dataAtivacao;
  }
  public void setDataAtivacao(String dataAtivacao) {
    this.dataAtivacao = dataAtivacao;
  }

  
  /**
   * Usu\u00E1rio ativou o servi\u00E7o
   **/
  @ApiModelProperty(value = "Usu\u00E1rio ativou o servi\u00E7o")
  public Long getIdUsuarioAtivacao() {
    return idUsuarioAtivacao;
  }
  public void setIdUsuarioAtivacao(Long idUsuarioAtivacao) {
    this.idUsuarioAtivacao = idUsuarioAtivacao;
  }

  
  /**
   * Plataforma que ativou o servi\u00E7o
   **/
  @ApiModelProperty(value = "Plataforma que ativou o servi\u00E7o")
  public Long getIdPlataformaAtivacao() {
    return idPlataformaAtivacao;
  }
  public void setIdPlataformaAtivacao(Long idPlataformaAtivacao) {
    this.idPlataformaAtivacao = idPlataformaAtivacao;
  }

  
  /**
   * Data de cancelamento do servi\u00E7o
   **/
  @ApiModelProperty(value = "Data de cancelamento do servi\u00E7o")
  public String getDataCancelamento() {
    return dataCancelamento;
  }
  public void setDataCancelamento(String dataCancelamento) {
    this.dataCancelamento = dataCancelamento;
  }

  
  /**
   * Usu\u00E1rio que cancelou o servi\u00E7o
   **/
  @ApiModelProperty(value = "Usu\u00E1rio que cancelou o servi\u00E7o")
  public Long getIdUsuarioCancelamento() {
    return idUsuarioCancelamento;
  }
  public void setIdUsuarioCancelamento(Long idUsuarioCancelamento) {
    this.idUsuarioCancelamento = idUsuarioCancelamento;
  }

  
  /**
   * Plataforma que cancelou o servi\u00E7o
   **/
  @ApiModelProperty(value = "Plataforma que cancelou o servi\u00E7o")
  public Long getIdPlataformaCancelamento() {
    return idPlataformaCancelamento;
  }
  public void setIdPlataformaCancelamento(Long idPlataformaCancelamento) {
    this.idPlataformaCancelamento = idPlataformaCancelamento;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServicoContaResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idTipoServico: ").append(idTipoServico).append("\n");
    sb.append("  dataAtivacao: ").append(dataAtivacao).append("\n");
    sb.append("  idUsuarioAtivacao: ").append(idUsuarioAtivacao).append("\n");
    sb.append("  idPlataformaAtivacao: ").append(idPlataformaAtivacao).append("\n");
    sb.append("  dataCancelamento: ").append(dataCancelamento).append("\n");
    sb.append("  idUsuarioCancelamento: ").append(idUsuarioCancelamento).append("\n");
    sb.append("  idPlataformaCancelamento: ").append(idPlataformaCancelamento).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
