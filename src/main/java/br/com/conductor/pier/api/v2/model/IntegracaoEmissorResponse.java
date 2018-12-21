package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Response of the integration register inclusion resource
 **/
@ApiModel(description = "Response of the integration register inclusion resource")
public class IntegracaoEmissorResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idArquivo")
  private Long idArquivo = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("dataInclusao")
  private String dataInclusao = null;
  @SerializedName("dataAlteracao")
  private String dataAlteracao = null;

  
  /**
   * Identification Code of the registetr in the IntegrationIssuer table
   **/
  @ApiModelProperty(value = "Identification Code of the registetr in the IntegrationIssuer table")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identification Code of the Account
   **/
  @ApiModelProperty(value = "Identification Code of the Account")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Identification Code of the file
   **/
  @ApiModelProperty(value = "Identification Code of the file")
  public Long getIdArquivo() {
    return idArquivo;
  }
  public void setIdArquivo(Long idArquivo) {
    this.idArquivo = idArquivo;
  }

  
  /**
   * Register Status
   **/
  @ApiModelProperty(value = "Register Status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * Date of the resgister inclusion
   **/
  @ApiModelProperty(value = "Date of the resgister inclusion")
  public String getDataInclusao() {
    return dataInclusao;
  }
  public void setDataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
  }

  
  /**
   * Date of the last update of the register
   **/
  @ApiModelProperty(value = "Date of the last update of the register")
  public String getDataAlteracao() {
    return dataAlteracao;
  }
  public void setDataAlteracao(String dataAlteracao) {
    this.dataAlteracao = dataAlteracao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegracaoEmissorResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idArquivo: ").append(idArquivo).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  dataInclusao: ").append(dataInclusao).append("\n");
    sb.append("  dataAlteracao: ").append(dataAlteracao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
