package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class CdtDetalheOportunidadeAUD  {
  
  @SerializedName("conteudo")
  private String conteudo = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idOportunidade")
  private Long idOportunidade = null;
  @SerializedName("nomeCampo")
  private String nomeCampo = null;
  @SerializedName("rev")
  private Long rev = null;
  @SerializedName("revDate")
  private String revDate = null;
  @SerializedName("revOportunidade")
  private Long revOportunidade = null;
  @SerializedName("revType")
  private Long revType = null;
  @SerializedName("revUser")
  private String revUser = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getConteudo() {
    return conteudo;
  }
  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
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
  public Long getIdOportunidade() {
    return idOportunidade;
  }
  public void setIdOportunidade(Long idOportunidade) {
    this.idOportunidade = idOportunidade;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getNomeCampo() {
    return nomeCampo;
  }
  public void setNomeCampo(String nomeCampo) {
    this.nomeCampo = nomeCampo;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getRev() {
    return rev;
  }
  public void setRev(Long rev) {
    this.rev = rev;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getRevDate() {
    return revDate;
  }
  public void setRevDate(String revDate) {
    this.revDate = revDate;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getRevOportunidade() {
    return revOportunidade;
  }
  public void setRevOportunidade(Long revOportunidade) {
    this.revOportunidade = revOportunidade;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getRevType() {
    return revType;
  }
  public void setRevType(Long revType) {
    this.revType = revType;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getRevUser() {
    return revUser;
  }
  public void setRevUser(String revUser) {
    this.revUser = revUser;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CdtDetalheOportunidadeAUD {\n");
    
    sb.append("  conteudo: ").append(conteudo).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idOportunidade: ").append(idOportunidade).append("\n");
    sb.append("  nomeCampo: ").append(nomeCampo).append("\n");
    sb.append("  rev: ").append(rev).append("\n");
    sb.append("  revDate: ").append(revDate).append("\n");
    sb.append("  revOportunidade: ").append(revOportunidade).append("\n");
    sb.append("  revType: ").append(revType).append("\n");
    sb.append("  revUser: ").append(revUser).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


