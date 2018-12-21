package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.ArquivoParametroResponse;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object Response of the file
 **/
@ApiModel(description = "Object Response of the file")
public class ArquivoDetalheResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idTipoArquivo")
  private Long idTipoArquivo = null;
  @SerializedName("nomeTipoArquivo")
  private String nomeTipoArquivo = null;
  @SerializedName("arquivo")
  private String arquivo = null;
  @SerializedName("idStatusArquivo")
  private Long idStatusArquivo = null;
  @SerializedName("nomeStatusArquivo")
  private String nomeStatusArquivo = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("extensao")
  private String extensao = null;
  @SerializedName("dataInclusao")
  private String dataInclusao = null;
  @SerializedName("dataAlteracao")
  private String dataAlteracao = null;
  @SerializedName("detalhes")
  private List<ArquivoParametroResponse> detalhes = null;

  
  /**
   * Identification Code of the file
   **/
  @ApiModelProperty(value = "Identification Code of the file")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identification Code of the Type of the File
   **/
  @ApiModelProperty(value = "Identification Code of the Type of the File")
  public Long getIdTipoArquivo() {
    return idTipoArquivo;
  }
  public void setIdTipoArquivo(Long idTipoArquivo) {
    this.idTipoArquivo = idTipoArquivo;
  }

  
  /**
   * Description type of the file
   **/
  @ApiModelProperty(value = "Description type of the file")
  public String getNomeTipoArquivo() {
    return nomeTipoArquivo;
  }
  public void setNomeTipoArquivo(String nomeTipoArquivo) {
    this.nomeTipoArquivo = nomeTipoArquivo;
  }

  
  /**
   * Content of the File converted in Base 64
   **/
  @ApiModelProperty(value = "Content of the File converted in Base 64")
  public String getArquivo() {
    return arquivo;
  }
  public void setArquivo(String arquivo) {
    this.arquivo = arquivo;
  }

  
  /**
   * Identification Code of the Status of the File
   **/
  @ApiModelProperty(value = "Identification Code of the Status of the File")
  public Long getIdStatusArquivo() {
    return idStatusArquivo;
  }
  public void setIdStatusArquivo(Long idStatusArquivo) {
    this.idStatusArquivo = idStatusArquivo;
  }

  
  /**
   * Descrption of the status of the file
   **/
  @ApiModelProperty(value = "Descrption of the status of the file")
  public String getNomeStatusArquivo() {
    return nomeStatusArquivo;
  }
  public void setNomeStatusArquivo(String nomeStatusArquivo) {
    this.nomeStatusArquivo = nomeStatusArquivo;
  }

  
  /**
   * Name of the file
   **/
  @ApiModelProperty(value = "Name of the file")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Format/Extension of the file
   **/
  @ApiModelProperty(value = "Format/Extension of the file")
  public String getExtensao() {
    return extensao;
  }
  public void setExtensao(String extensao) {
    this.extensao = extensao;
  }

  
  /**
   * Date of Inclusion of the file
   **/
  @ApiModelProperty(value = "Date of Inclusion of the file")
  public String getDataInclusao() {
    return dataInclusao;
  }
  public void setDataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
  }

  
  /**
   * Date of the last update of the file
   **/
  @ApiModelProperty(value = "Date of the last update of the file")
  public String getDataAlteracao() {
    return dataAlteracao;
  }
  public void setDataAlteracao(String dataAlteracao) {
    this.dataAlteracao = dataAlteracao;
  }

  
  /**
   * Details containing additional information, related to the file
   **/
  @ApiModelProperty(value = "Details containing additional information, related to the file")
  public List<ArquivoParametroResponse> getDetalhes() {
    return detalhes;
  }
  public void setDetalhes(List<ArquivoParametroResponse> detalhes) {
    this.detalhes = detalhes;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArquivoDetalheResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idTipoArquivo: ").append(idTipoArquivo).append("\n");
    sb.append("  nomeTipoArquivo: ").append(nomeTipoArquivo).append("\n");
    sb.append("  arquivo: ").append(arquivo).append("\n");
    sb.append("  idStatusArquivo: ").append(idStatusArquivo).append("\n");
    sb.append("  nomeStatusArquivo: ").append(nomeStatusArquivo).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  extensao: ").append(extensao).append("\n");
    sb.append("  dataInclusao: ").append(dataInclusao).append("\n");
    sb.append("  dataAlteracao: ").append(dataAlteracao).append("\n");
    sb.append("  detalhes: ").append(detalhes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
