package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Response Service Account Object
 **/
@ApiModel(description = "Response Service Account Object")
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
   * Account Service Identifier
   **/
  @ApiModelProperty(value = "Account Service Identifier")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Account Identifier
   **/
  @ApiModelProperty(value = "Account Identifier")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Service Type Identifier
   **/
  @ApiModelProperty(value = "Service Type Identifier")
  public Long getIdTipoServico() {
    return idTipoServico;
  }
  public void setIdTipoServico(Long idTipoServico) {
    this.idTipoServico = idTipoServico;
  }

  
  /**
   * Service activation date
   **/
  @ApiModelProperty(value = "Service activation date")
  public String getDataAtivacao() {
    return dataAtivacao;
  }
  public void setDataAtivacao(String dataAtivacao) {
    this.dataAtivacao = dataAtivacao;
  }

  
  /**
   * User activated the service
   **/
  @ApiModelProperty(value = "User activated the service")
  public Long getIdUsuarioAtivacao() {
    return idUsuarioAtivacao;
  }
  public void setIdUsuarioAtivacao(Long idUsuarioAtivacao) {
    this.idUsuarioAtivacao = idUsuarioAtivacao;
  }

  
  /**
   * Platform activated service
   **/
  @ApiModelProperty(value = "Platform activated service")
  public Long getIdPlataformaAtivacao() {
    return idPlataformaAtivacao;
  }
  public void setIdPlataformaAtivacao(Long idPlataformaAtivacao) {
    this.idPlataformaAtivacao = idPlataformaAtivacao;
  }

  
  /**
   * Service cancellation date
   **/
  @ApiModelProperty(value = "Service cancellation date")
  public String getDataCancelamento() {
    return dataCancelamento;
  }
  public void setDataCancelamento(String dataCancelamento) {
    this.dataCancelamento = dataCancelamento;
  }

  
  /**
   * User canceled service
   **/
  @ApiModelProperty(value = "User canceled service")
  public Long getIdUsuarioCancelamento() {
    return idUsuarioCancelamento;
  }
  public void setIdUsuarioCancelamento(Long idUsuarioCancelamento) {
    this.idUsuarioCancelamento = idUsuarioCancelamento;
  }

  
  /**
   * Platform canceled service
   **/
  @ApiModelProperty(value = "Platform canceled service")
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
