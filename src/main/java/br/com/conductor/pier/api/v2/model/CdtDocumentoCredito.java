package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class CdtDocumentoCredito  {
  
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("doc")
  private Boolean doc = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idAtividadeDeCredito")
  private Long idAtividadeDeCredito = null;
  @SerializedName("obrigatorio")
  private Boolean obrigatorio = null;
  @SerializedName("tela")
  private Boolean tela = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getDoc() {
    return doc;
  }
  public void setDoc(Boolean doc) {
    this.doc = doc;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getIdAtividadeDeCredito() {
    return idAtividadeDeCredito;
  }
  public void setIdAtividadeDeCredito(Long idAtividadeDeCredito) {
    this.idAtividadeDeCredito = idAtividadeDeCredito;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getObrigatorio() {
    return obrigatorio;
  }
  public void setObrigatorio(Boolean obrigatorio) {
    this.obrigatorio = obrigatorio;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getTela() {
    return tela;
  }
  public void setTela(Boolean tela) {
    this.tela = tela;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CdtDocumentoCredito {\n");
    
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  doc: ").append(doc).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idAtividadeDeCredito: ").append(idAtividadeDeCredito).append("\n");
    sb.append("  obrigatorio: ").append(obrigatorio).append("\n");
    sb.append("  tela: ").append(tela).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
