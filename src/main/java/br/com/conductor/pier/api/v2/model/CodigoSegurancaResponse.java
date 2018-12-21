package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object security code
 **/
@ApiModel(description = "Object security code")
public class CodigoSegurancaResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idEmissor")
  private Long idEmissor = null;
  @SerializedName("modoEnvio")
  private String modoEnvio = null;
  @SerializedName("contato")
  private String contato = null;
  @SerializedName("ativo")
  private Boolean ativo = null;
  @SerializedName("dataValidade")
  private String dataValidade = null;

  
  /**
   * Identification Code of the Safety Code (id)
   **/
  @ApiModelProperty(value = "Identification Code of the Safety Code (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identification Code of the Issuer. (idIssuer)
   **/
  @ApiModelProperty(value = "Identification Code of the Issuer. (idIssuer)")
  public Long getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
  }

  
  /**
   * Show the sending model of the Safety Code
   **/
  @ApiModelProperty(value = "Show the sending model of the Safety Code")
  public String getModoEnvio() {
    return modoEnvio;
  }
  public void setModoEnvio(String modoEnvio) {
    this.modoEnvio = modoEnvio;
  }

  
  /**
   * Show the contact of the safety code
   **/
  @ApiModelProperty(value = "Show the contact of the safety code")
  public String getContato() {
    return contato;
  }
  public void setContato(String contato) {
    this.contato = contato;
  }

  
  /**
   * Show the statys of the Safety Code
   **/
  @ApiModelProperty(value = "Show the statys of the Safety Code")
  public Boolean getAtivo() {
    return ativo;
  }
  public void setAtivo(Boolean ativo) {
    this.ativo = ativo;
  }

  
  /**
   * Show the expiration date of the safety code created
   **/
  @ApiModelProperty(value = "Show the expiration date of the safety code created")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodigoSegurancaResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idEmissor: ").append(idEmissor).append("\n");
    sb.append("  modoEnvio: ").append(modoEnvio).append("\n");
    sb.append("  contato: ").append(contato).append("\n");
    sb.append("  ativo: ").append(ativo).append("\n");
    sb.append("  dataValidade: ").append(dataValidade).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
