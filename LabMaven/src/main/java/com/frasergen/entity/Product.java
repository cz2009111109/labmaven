package com.frasergen.entity;

public class Product {
	private int productID;
	private float Genome_survey;
	private float two_WGS;
	private float Genetic_Map_QTL; 
	private float BSA;
	private float RNA_seq;
	private float sRNA_seq;
	private float Interaction_transcriptome;
	private float Prokaryotic_RNA_Seq;
	private float three_C;
	private float Hi_C_interaction;
	private float Hi_C_assembly;
	private float two_18S_16S_ITS;
	private float two_Metagenome;
	private float two_Metatranscriptome;
	private float De_novo_assembly;
	private float Microbial_genome_assembly;
	private float three_WGS;
	private float Iso_seq;
	private float three_18S_16S_ITS;
	private float three_Metagenome;
	private float three_Metatranscriptome;
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public float getGenome_survey() {
		return Genome_survey;
	}
	public void setGenome_survey(float genome_survey) {
		Genome_survey = genome_survey;
	}
	public float getTwo_WGS() {
		return two_WGS;
	}
	public void setTwo_WGS(float two_WGS) {
		this.two_WGS = two_WGS;
	}
	public float getGenetic_Map_QTL() {
		return Genetic_Map_QTL;
	}
	public void setGenetic_Map_QTL(float genetic_Map_QTL) {
		Genetic_Map_QTL = genetic_Map_QTL;
	}
	public float getBSA() {
		return BSA;
	}
	public void setBSA(float bSA) {
		BSA = bSA;
	}
	public float getRNA_seq() {
		return RNA_seq;
	}
	public void setRNA_seq(float rNA_seq) {
		RNA_seq = rNA_seq;
	}
	public float getsRNA_seq() {
		return sRNA_seq;
	}
	public void setsRNA_seq(float sRNA_seq) {
		this.sRNA_seq = sRNA_seq;
	}
	public float getInteraction_transcriptome() {
		return Interaction_transcriptome;
	}
	public void setInteraction_transcriptome(float interaction_transcriptome) {
		Interaction_transcriptome = interaction_transcriptome;
	}
	public float getProkaryotic_RNA_Seq() {
		return Prokaryotic_RNA_Seq;
	}
	public void setProkaryotic_RNA_Seq(float prokaryotic_RNA_Seq) {
		Prokaryotic_RNA_Seq = prokaryotic_RNA_Seq;
	}
	public float getThree_C() {
		return three_C;
	}
	public void setThree_C(float three_C) {
		this.three_C = three_C;
	}
	public float getHi_C_interaction() {
		return Hi_C_interaction;
	}
	public void setHi_C_interaction(float hi_C_interaction) {
		Hi_C_interaction = hi_C_interaction;
	}
	public float getHi_C_assembly() {
		return Hi_C_assembly;
	}
	public void setHi_C_assembly(float hi_C_assembly) {
		Hi_C_assembly = hi_C_assembly;
	}
	public float getTwo_18S_16S_ITS() {
		return two_18S_16S_ITS;
	}
	public void setTwo_18S_16S_ITS(float two_18s_16s_ITS) {
		two_18S_16S_ITS = two_18s_16s_ITS;
	}
	public float getTwo_Metagenome() {
		return two_Metagenome;
	}
	public void setTwo_Metagenome(float two_Metagenome) {
		this.two_Metagenome = two_Metagenome;
	}
	public float getTwo_Metatranscriptome() {
		return two_Metatranscriptome;
	}
	public void setTwo_Metatranscriptome(float two_Metatranscriptome) {
		this.two_Metatranscriptome = two_Metatranscriptome;
	}
	public float getDe_novo_assembly() {
		return De_novo_assembly;
	}
	public void setDe_novo_assembly(float de_novo_assembly) {
		De_novo_assembly = de_novo_assembly;
	}
	public float getMicrobial_genome_assembly() {
		return Microbial_genome_assembly;
	}
	public void setMicrobial_genome_assembly(float microbial_genome_assembly) {
		Microbial_genome_assembly = microbial_genome_assembly;
	}
	public float getThree_WGS() {
		return three_WGS;
	}
	public void setThree_WGS(float three_WGS) {
		this.three_WGS = three_WGS;
	}
	public float getIso_seq() {
		return Iso_seq;
	}
	public void setIso_seq(float iso_seq) {
		Iso_seq = iso_seq;
	}
	public float getThree_18S_16S_ITS() {
		return three_18S_16S_ITS;
	}
	public void setThree_18S_16S_ITS(float three_18s_16s_ITS) {
		three_18S_16S_ITS = three_18s_16s_ITS;
	}
	public float getThree_Metagenome() {
		return three_Metagenome;
	}
	public void setThree_Metagenome(float three_Metagenome) {
		this.three_Metagenome = three_Metagenome;
	}
	public float getThree_Metatranscriptome() {
		return three_Metatranscriptome;
	}
	public void setThree_Metatranscriptome(float three_Metatranscriptome) {
		this.three_Metatranscriptome = three_Metatranscriptome;
	}
	public Product(int productID, float genome_survey, float two_WGS, float genetic_Map_QTL, float bSA, float rNA_seq,
			float sRNA_seq, float interaction_transcriptome, float prokaryotic_RNA_Seq, float three_C,
			float hi_C_interaction, float hi_C_assembly, float two_18s_16s_ITS, float two_Metagenome,
			float two_Metatranscriptome, float de_novo_assembly, float microbial_genome_assembly, float three_WGS,
			float iso_seq, float three_18s_16s_ITS, float three_Metagenome, float three_Metatranscriptome) {
		super();
		this.productID = productID;
		Genome_survey = genome_survey;
		this.two_WGS = two_WGS;
		Genetic_Map_QTL = genetic_Map_QTL;
		BSA = bSA;
		RNA_seq = rNA_seq;
		this.sRNA_seq = sRNA_seq;
		Interaction_transcriptome = interaction_transcriptome;
		Prokaryotic_RNA_Seq = prokaryotic_RNA_Seq;
		this.three_C = three_C;
		Hi_C_interaction = hi_C_interaction;
		Hi_C_assembly = hi_C_assembly;
		two_18S_16S_ITS = two_18s_16s_ITS;
		this.two_Metagenome = two_Metagenome;
		this.two_Metatranscriptome = two_Metatranscriptome;
		De_novo_assembly = de_novo_assembly;
		Microbial_genome_assembly = microbial_genome_assembly;
		this.three_WGS = three_WGS;
		Iso_seq = iso_seq;
		three_18S_16S_ITS = three_18s_16s_ITS;
		this.three_Metagenome = three_Metagenome;
		this.three_Metatranscriptome = three_Metatranscriptome;
	}
	public Product(float genome_survey, float two_WGS, float genetic_Map_QTL, float bSA, float rNA_seq, float sRNA_seq,
			float interaction_transcriptome, float prokaryotic_RNA_Seq, float three_C, float hi_C_interaction,
			float hi_C_assembly, float two_18s_16s_ITS, float two_Metagenome, float two_Metatranscriptome,
			float de_novo_assembly, float microbial_genome_assembly, float three_WGS, float iso_seq,
			float three_18s_16s_ITS, float three_Metagenome, float three_Metatranscriptome) {
		super();
		Genome_survey = genome_survey;
		this.two_WGS = two_WGS;
		Genetic_Map_QTL = genetic_Map_QTL;
		BSA = bSA;
		RNA_seq = rNA_seq;
		this.sRNA_seq = sRNA_seq;
		Interaction_transcriptome = interaction_transcriptome;
		Prokaryotic_RNA_Seq = prokaryotic_RNA_Seq;
		this.three_C = three_C;
		Hi_C_interaction = hi_C_interaction;
		Hi_C_assembly = hi_C_assembly;
		two_18S_16S_ITS = two_18s_16s_ITS;
		this.two_Metagenome = two_Metagenome;
		this.two_Metatranscriptome = two_Metatranscriptome;
		De_novo_assembly = de_novo_assembly;
		Microbial_genome_assembly = microbial_genome_assembly;
		this.three_WGS = three_WGS;
		Iso_seq = iso_seq;
		three_18S_16S_ITS = three_18s_16s_ITS;
		this.three_Metagenome = three_Metagenome;
		this.three_Metatranscriptome = three_Metatranscriptome;
	}
	public Product() {
		super();
	}
	
}
